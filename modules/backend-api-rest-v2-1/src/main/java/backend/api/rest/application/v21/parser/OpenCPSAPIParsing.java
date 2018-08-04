package backend.api.rest.application.v21.parser;

import java.util.ArrayList;
import java.util.List;

import org.opencps.dossiermgt.model.ActionConfig;
import org.opencps.dossiermgt.model.MenuConfig;
import org.opencps.dossiermgt.model.MenuRole;
import org.opencps.dossiermgt.model.StepConfig;
import org.opencps.dossiermgt.service.MenuConfigLocalServiceUtil;
import org.opencps.dossiermgt.service.MenuRoleLocalServiceUtil;
import org.opencps.dossiermgt.service.StepConfigLocalServiceUtil;
import org.opencps.usermgt.model.Applicant;
import org.opencps.usermgt.model.Employee;
import org.opencps.usermgt.service.ApplicantLocalServiceUtil;
import org.opencps.usermgt.service.EmployeeLocalServiceUtil;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;

import io.swagger.model.ActionConfigItem;
import io.swagger.model.MenuConfigItem;
import io.swagger.model.MenuConfigItemResult;
import io.swagger.model.MenuConfigStepsItem;
import io.swagger.model.StepConfigItem;

public class OpenCPSAPIParsing {
	protected Log _log = LogFactoryUtil.getLog(OpenCPSAPIParsing.class);
	
//	private OpenCPSAPIParsing() {
//		
//	}
	
//	OpenCPSAPIParsing.getLocatorResponseToDealershipResponseConverter(locale).convert(ActionConfig);
//
//	public static Converter<ActionConfig, ActionConfigItem> getLocatorResponseToDealershipResponseConverter(
//			   String locale) {
//			  return (source) -> {
//			   DealershipResponse dealershipResponse = new DealershipResponse();
//
//			   if (source.getLocatorResult().get(0) != null) {
//
//			    Vendor firstVendor = source.getLocatorResult().get(0).getVendor();
//
//			    Contact contact = getContactMain(firstVendor.getContact());
//
//			    Phone phone = getPhoneMain(contact.getPhone());
//
//			    Address address = getAddress(contact);
//
//			    List<DealerCode> dealerCodes = getDealerCodeList(source.getLocatorResult().get(0), locale);
//
//			    dealershipResponse.setBacCode(String.valueOf(firstVendor.getId()));
//			    dealershipResponse.setDealerCity(address.getCity());
//			    dealershipResponse.setDealerCode(firstVendor.getVendorCode());
//			    dealershipResponse.setDealerPhone(phone.getNumber());
//			    dealershipResponse.setDealerState(address.getProvince());
//			    dealershipResponse.setDealerStreet1(getAddressStreet(address).getValue());
//			    dealershipResponse.setDealerType(firstVendor.getType().value());
//			    dealershipResponse.setDealerZip(address.getPostalCode());
//			    dealershipResponse.setName(firstVendor.getPrimaryName());
//			    dealershipResponse.setDealerCodes(dealerCodes);
//			   }
//			   return dealershipResponse;
//			  };
//	}
	public ActionConfigItem getModel(ActionConfig ett) {
		ActionConfigItem object = new ActionConfigItem();
		
		try {
			object = JSONFactoryUtil.looseDeserialize(JSONFactoryUtil.looseSerialize(ett),
					ActionConfigItem.class);
		}
		catch (Exception e) {
//			e.printStackTrace();
		}
		return object;

	}

	public StepConfigItem getModel(StepConfig ett) {

		StepConfigItem object = JSONFactoryUtil.looseDeserialize(JSONFactoryUtil.looseSerialize(ett),
				StepConfigItem.class);

		return object;

	}

	public MenuConfigItem getModel(MenuConfig ett) {

		MenuConfigItem object = JSONFactoryUtil.looseDeserialize(JSONFactoryUtil.looseSerialize(ett),
				MenuConfigItem.class);

		return object;

	}

	public MenuConfigItemResult getModel(long groupId, User user) {
		MenuConfigItemResult object = new MenuConfigItemResult();
		List<MenuConfigItem> data = new ArrayList<>();
		
		Applicant applicant = ApplicantLocalServiceUtil.fetchByMappingID(user.getUserId());
		if (applicant == null) {
			Employee employee = EmployeeLocalServiceUtil.fetchByF_mappingUserId(groupId, user.getUserId());
			if (employee != null) {
				List<Role> lstRoles = RoleLocalServiceUtil.getUserRoles(user.getUserId());
				long[] arrRoles = new long[lstRoles.size()];
				int i = 0;
				for (Role r : lstRoles) {
					arrRoles[i++] = r.getRoleId();
				}
				List<MenuRole> lstMenuRoles = i > 0 ? MenuRoleLocalServiceUtil.getByRoles(arrRoles) : new ArrayList<>();
				long[] arrMenuConfigIds = new long[lstMenuRoles.size()];
				i = 0;
				for (MenuRole r : lstMenuRoles) {
					arrMenuConfigIds[i++] = r.getMenuConfigId();
				}
				
				List<MenuConfig> lstMenus = i > 0 ? MenuConfigLocalServiceUtil.getByMenus(arrMenuConfigIds) : new ArrayList<>();
				List<StepConfig> lstSteps = StepConfigLocalServiceUtil.getStepByGroupId(groupId);

				for (MenuConfig menuConfig : lstMenus) {
					MenuConfigItem menuConfigItem = mappingMenuConfigItem(menuConfig);
					MenuConfigStepsItem menuConfigStepsItem = new MenuConfigStepsItem();
					List<MenuConfigStepsItem> menuConfigStepsItems = new ArrayList<>();
					
					for (StepConfig stepConfig : lstSteps) {
						if (menuConfig.getMenuGroup().trim().equals(stepConfig.getMenuGroup().trim())) {
							if (stepConfig.getStepType() == 1 || stepConfig.getStepType() == 2) {
								menuConfigStepsItem = mappingMenuConfigStepsItem(stepConfig);
								
								menuConfigStepsItems.add(menuConfigStepsItem);							
							}
						}
					}
					
					menuConfigItem.getSteps().addAll(menuConfigStepsItems);
					
					data.add(menuConfigItem);
				}				
			}
		}
		else {
			List<MenuConfig> lstMenus = MenuConfigLocalServiceUtil.getByGroupId(groupId);
			List<StepConfig> lstSteps = StepConfigLocalServiceUtil.getStepByGroupId(groupId);

			for (MenuConfig menuConfig : lstMenus) {
				MenuConfigItem menuConfigItem = mappingMenuConfigItem(menuConfig);
				MenuConfigStepsItem menuConfigStepsItem = new MenuConfigStepsItem();
				List<MenuConfigStepsItem> menuConfigStepsItems = new ArrayList<>();
				
				for (StepConfig stepConfig : lstSteps) {
					if (menuConfig.getMenuGroup().trim().equals(stepConfig.getMenuGroup().trim())) {
						if (stepConfig.getStepType() == 1 || stepConfig.getStepType() == 2) {
							menuConfigStepsItem = mappingMenuConfigStepsItem(stepConfig);
							
							menuConfigStepsItems.add(menuConfigStepsItem);							
						}
					}
				}
				
				menuConfigItem.getSteps().addAll(menuConfigStepsItems);
				
				data.add(menuConfigItem);
			}
		}
		
		object.setData(data);
		object.setTotal(Long.valueOf(data.size()));
		return object;
	}
	
	public MenuConfigItem mappingMenuConfigItem(MenuConfig menuConfig) {
		MenuConfigItem menuConfigItem = new MenuConfigItem();
		menuConfigItem.setMenuGroup(menuConfig.getMenuGroup());
		menuConfigItem.setMenuName(menuConfig.getMenuName());
		menuConfigItem.setOrder(menuConfig.getOrder());
		menuConfigItem.setMenuType(menuConfig.getMenuType());
		menuConfigItem.setQueryParams(menuConfig.getQueryParams());
		menuConfigItem.setButtonConfig(menuConfig.getButtonConfig());
		menuConfigItem.setTableConfig(menuConfig.getTableConfig());
		
		return menuConfigItem;
	}
	
	public MenuConfigStepsItem mappingMenuConfigStepsItem(StepConfig stepConfig) {
		MenuConfigStepsItem menuConfigStepsItem = new MenuConfigStepsItem();
		if (stepConfig.getStepType() == 1 || stepConfig.getStepType() == 2) {
			menuConfigStepsItem = new MenuConfigStepsItem();
			menuConfigStepsItem.setStepCode(stepConfig.getStepCode());
			menuConfigStepsItem.setStepName(stepConfig.getStepName());
			menuConfigStepsItem.setMenuStepName(stepConfig.getMenuStepName());
			menuConfigStepsItem.setButtonConfig(stepConfig.getButtonConfig());
			menuConfigStepsItem.setDossierStatus(stepConfig.getDossierStatus());
			menuConfigStepsItem.setDossierSubStatus(stepConfig.getDossierSubStatus());			
		}		
		
		return menuConfigStepsItem;
	}
	public MenuConfigItemResult getModel(JSONObject ett) {

		MenuConfigItemResult object = new MenuConfigItemResult();

		JSONArray resultData = ett.getJSONObject("hits").getJSONArray("hits");

		List<MenuConfigItem> data = new ArrayList<>();
		
		JSONArray arrayStep = JSONFactoryUtil.createJSONArray();
		
		for (int i = 0; i < resultData.length(); i++) {

			JSONObject current = resultData.getJSONObject(i).getJSONObject("_source");
			
			if (current.getString("entryClassName").equalsIgnoreCase(MenuConfig.class.getName()) 
					&& current.getInt("menuType") != 0) {
				MenuConfigItem objectItem = JSONFactoryUtil.looseDeserialize(current.toJSONString(), MenuConfigItem.class);
				data.add(objectItem);
			} else if (current.getString("entryClassName").equalsIgnoreCase(StepConfig.class.getName())) {
				arrayStep.put(current);
			}
			
		}
		
		List<MenuConfigStepsItem> menuConfigStepsItems = new ArrayList<>();
		MenuConfigStepsItem menuConfigStepsItem = new MenuConfigStepsItem();
		
		for (MenuConfigItem menuConfigItem : data) {
			
			menuConfigStepsItems = menuConfigItem.getSteps();
			
			for (int i = 0; i < arrayStep.length(); i++) {

				JSONObject current = arrayStep.getJSONObject(i);
				if (menuConfigItem.getMenuGroup().trim().equals(current.getString("menuGroup"))
						&& (current.getInt("stepType") == 1 || current.getInt("stepType") == 2)) {
					
					menuConfigStepsItem = new MenuConfigStepsItem();

					menuConfigStepsItem.setStepCode(current.getString("stepCode"));
					menuConfigStepsItem.setStepName(current.getString("stepName"));
					menuConfigStepsItem.setMenuStepName(current.getString("menuStepName"));
					menuConfigStepsItem.setButtonConfig(current.getString("buttonConfig"));
					menuConfigStepsItem.setDossierStatus(current.getString("dossierStatus"));
					menuConfigStepsItem.setDossierSubStatus(current.getString("dossierSubStatus"));
					
					menuConfigStepsItems.add(menuConfigStepsItem);
					
				}
				
			}
			menuConfigItem.setSteps(menuConfigStepsItems);
		}
		
		object.setData(data);
		object.setTotal(Long.valueOf(data.size()));
		return object;

	}
}