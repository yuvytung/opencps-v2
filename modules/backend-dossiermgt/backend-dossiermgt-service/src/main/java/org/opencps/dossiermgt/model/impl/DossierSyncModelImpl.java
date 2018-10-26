/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.dossiermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import org.opencps.dossiermgt.model.DossierSync;
import org.opencps.dossiermgt.model.DossierSyncModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DossierSync service. Represents a row in the &quot;opencps_dossiersync&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link DossierSyncModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierSyncImpl}.
 * </p>
 *
 * @author huymq
 * @see DossierSyncImpl
 * @see DossierSync
 * @see DossierSyncModel
 * @generated
 */
@ProviderType
public class DossierSyncModelImpl extends BaseModelImpl<DossierSync>
	implements DossierSyncModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier sync model instance should use the {@link DossierSync} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_dossiersync";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "DossierSyncId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "dossierId", Types.BIGINT },
			{ "dossierRefUid", Types.VARCHAR },
			{ "syncRefUid", Types.VARCHAR },
			{ "dossierActionId", Types.BIGINT },
			{ "actionCode", Types.VARCHAR },
			{ "actionName", Types.VARCHAR },
			{ "actionUser", Types.VARCHAR },
			{ "actionNote", Types.VARCHAR },
			{ "syncType", Types.INTEGER },
			{ "infoType", Types.INTEGER },
			{ "payload", Types.VARCHAR },
			{ "serverNo", Types.VARCHAR },
			{ "state_", Types.INTEGER },
			{ "retry", Types.INTEGER },
			{ "messageText", Types.VARCHAR },
			{ "acknowlegement", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("DossierSyncId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("dossierId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dossierRefUid", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("syncRefUid", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dossierActionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("actionCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("actionName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("actionUser", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("actionNote", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("syncType", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("infoType", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("payload", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serverNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("state_", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("retry", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("messageText", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("acknowlegement", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table opencps_dossiersync (uuid_ VARCHAR(75) null,DossierSyncId LONG not null primary key,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,dossierId LONG,dossierRefUid VARCHAR(75) null,syncRefUid VARCHAR(75) null,dossierActionId LONG,actionCode VARCHAR(75) null,actionName VARCHAR(75) null,actionUser VARCHAR(75) null,actionNote VARCHAR(75) null,syncType INTEGER,infoType INTEGER,payload VARCHAR(75) null,serverNo VARCHAR(75) null,state_ INTEGER,retry INTEGER,messageText VARCHAR(75) null,acknowlegement VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table opencps_dossiersync";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierSync.modifiedDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_dossiersync.modifiedDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.dossiermgt.model.DossierSync"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.dossiermgt.model.DossierSync"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.dossiermgt.model.DossierSync"),
			true);
	public static final long ACTIONCODE_COLUMN_BITMASK = 1L;
	public static final long DOSSIERREFUID_COLUMN_BITMASK = 2L;
	public static final long GROUPID_COLUMN_BITMASK = 4L;
	public static final long INFOTYPE_COLUMN_BITMASK = 8L;
	public static final long STATE_COLUMN_BITMASK = 16L;
	public static final long SYNCTYPE_COLUMN_BITMASK = 32L;
	public static final long UUID_COLUMN_BITMASK = 64L;
	public static final long MODIFIEDDATE_COLUMN_BITMASK = 128L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"lock.expiration.time.org.opencps.dossiermgt.model.DossierSync"));

	public DossierSyncModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _DossierSyncId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDossierSyncId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _DossierSyncId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DossierSync.class;
	}

	@Override
	public String getModelClassName() {
		return DossierSync.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("DossierSyncId", getDossierSyncId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierId", getDossierId());
		attributes.put("dossierRefUid", getDossierRefUid());
		attributes.put("syncRefUid", getSyncRefUid());
		attributes.put("dossierActionId", getDossierActionId());
		attributes.put("actionCode", getActionCode());
		attributes.put("actionName", getActionName());
		attributes.put("actionUser", getActionUser());
		attributes.put("actionNote", getActionNote());
		attributes.put("syncType", getSyncType());
		attributes.put("infoType", getInfoType());
		attributes.put("payload", getPayload());
		attributes.put("serverNo", getServerNo());
		attributes.put("state", getState());
		attributes.put("retry", getRetry());
		attributes.put("messageText", getMessageText());
		attributes.put("acknowlegement", getAcknowlegement());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long DossierSyncId = (Long)attributes.get("DossierSyncId");

		if (DossierSyncId != null) {
			setDossierSyncId(DossierSyncId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		String dossierRefUid = (String)attributes.get("dossierRefUid");

		if (dossierRefUid != null) {
			setDossierRefUid(dossierRefUid);
		}

		String syncRefUid = (String)attributes.get("syncRefUid");

		if (syncRefUid != null) {
			setSyncRefUid(syncRefUid);
		}

		Long dossierActionId = (Long)attributes.get("dossierActionId");

		if (dossierActionId != null) {
			setDossierActionId(dossierActionId);
		}

		String actionCode = (String)attributes.get("actionCode");

		if (actionCode != null) {
			setActionCode(actionCode);
		}

		String actionName = (String)attributes.get("actionName");

		if (actionName != null) {
			setActionName(actionName);
		}

		String actionUser = (String)attributes.get("actionUser");

		if (actionUser != null) {
			setActionUser(actionUser);
		}

		String actionNote = (String)attributes.get("actionNote");

		if (actionNote != null) {
			setActionNote(actionNote);
		}

		Integer syncType = (Integer)attributes.get("syncType");

		if (syncType != null) {
			setSyncType(syncType);
		}

		Integer infoType = (Integer)attributes.get("infoType");

		if (infoType != null) {
			setInfoType(infoType);
		}

		String payload = (String)attributes.get("payload");

		if (payload != null) {
			setPayload(payload);
		}

		String serverNo = (String)attributes.get("serverNo");

		if (serverNo != null) {
			setServerNo(serverNo);
		}

		Integer state = (Integer)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		Integer retry = (Integer)attributes.get("retry");

		if (retry != null) {
			setRetry(retry);
		}

		String messageText = (String)attributes.get("messageText");

		if (messageText != null) {
			setMessageText(messageText);
		}

		String acknowlegement = (String)attributes.get("acknowlegement");

		if (acknowlegement != null) {
			setAcknowlegement(acknowlegement);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getDossierSyncId() {
		return _DossierSyncId;
	}

	@Override
	public void setDossierSyncId(long DossierSyncId) {
		_DossierSyncId = DossierSyncId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_columnBitmask = -1L;

		_modifiedDate = modifiedDate;
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	@Override
	public String getDossierRefUid() {
		if (_dossierRefUid == null) {
			return "";
		}
		else {
			return _dossierRefUid;
		}
	}

	@Override
	public void setDossierRefUid(String dossierRefUid) {
		_columnBitmask |= DOSSIERREFUID_COLUMN_BITMASK;

		if (_originalDossierRefUid == null) {
			_originalDossierRefUid = _dossierRefUid;
		}

		_dossierRefUid = dossierRefUid;
	}

	public String getOriginalDossierRefUid() {
		return GetterUtil.getString(_originalDossierRefUid);
	}

	@Override
	public String getSyncRefUid() {
		if (_syncRefUid == null) {
			return "";
		}
		else {
			return _syncRefUid;
		}
	}

	@Override
	public void setSyncRefUid(String syncRefUid) {
		_syncRefUid = syncRefUid;
	}

	@Override
	public long getDossierActionId() {
		return _dossierActionId;
	}

	@Override
	public void setDossierActionId(long dossierActionId) {
		_dossierActionId = dossierActionId;
	}

	@Override
	public String getActionCode() {
		if (_actionCode == null) {
			return "";
		}
		else {
			return _actionCode;
		}
	}

	@Override
	public void setActionCode(String actionCode) {
		_columnBitmask |= ACTIONCODE_COLUMN_BITMASK;

		if (_originalActionCode == null) {
			_originalActionCode = _actionCode;
		}

		_actionCode = actionCode;
	}

	public String getOriginalActionCode() {
		return GetterUtil.getString(_originalActionCode);
	}

	@Override
	public String getActionName() {
		if (_actionName == null) {
			return "";
		}
		else {
			return _actionName;
		}
	}

	@Override
	public void setActionName(String actionName) {
		_actionName = actionName;
	}

	@Override
	public String getActionUser() {
		if (_actionUser == null) {
			return "";
		}
		else {
			return _actionUser;
		}
	}

	@Override
	public void setActionUser(String actionUser) {
		_actionUser = actionUser;
	}

	@Override
	public String getActionNote() {
		if (_actionNote == null) {
			return "";
		}
		else {
			return _actionNote;
		}
	}

	@Override
	public void setActionNote(String actionNote) {
		_actionNote = actionNote;
	}

	@Override
	public int getSyncType() {
		return _syncType;
	}

	@Override
	public void setSyncType(int syncType) {
		_columnBitmask |= SYNCTYPE_COLUMN_BITMASK;

		if (!_setOriginalSyncType) {
			_setOriginalSyncType = true;

			_originalSyncType = _syncType;
		}

		_syncType = syncType;
	}

	public int getOriginalSyncType() {
		return _originalSyncType;
	}

	@Override
	public int getInfoType() {
		return _infoType;
	}

	@Override
	public void setInfoType(int infoType) {
		_columnBitmask |= INFOTYPE_COLUMN_BITMASK;

		if (!_setOriginalInfoType) {
			_setOriginalInfoType = true;

			_originalInfoType = _infoType;
		}

		_infoType = infoType;
	}

	public int getOriginalInfoType() {
		return _originalInfoType;
	}

	@Override
	public String getPayload() {
		if (_payload == null) {
			return "";
		}
		else {
			return _payload;
		}
	}

	@Override
	public void setPayload(String payload) {
		_payload = payload;
	}

	@Override
	public String getServerNo() {
		if (_serverNo == null) {
			return "";
		}
		else {
			return _serverNo;
		}
	}

	@Override
	public void setServerNo(String serverNo) {
		_serverNo = serverNo;
	}

	@Override
	public int getState() {
		return _state;
	}

	@Override
	public void setState(int state) {
		_columnBitmask |= STATE_COLUMN_BITMASK;

		if (!_setOriginalState) {
			_setOriginalState = true;

			_originalState = _state;
		}

		_state = state;
	}

	public int getOriginalState() {
		return _originalState;
	}

	@Override
	public int getRetry() {
		return _retry;
	}

	@Override
	public void setRetry(int retry) {
		_retry = retry;
	}

	@Override
	public String getMessageText() {
		if (_messageText == null) {
			return "";
		}
		else {
			return _messageText;
		}
	}

	@Override
	public void setMessageText(String messageText) {
		_messageText = messageText;
	}

	@Override
	public String getAcknowlegement() {
		if (_acknowlegement == null) {
			return "";
		}
		else {
			return _acknowlegement;
		}
	}

	@Override
	public void setAcknowlegement(String acknowlegement) {
		_acknowlegement = acknowlegement;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			DossierSync.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DossierSync toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierSync)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierSyncImpl dossierSyncImpl = new DossierSyncImpl();

		dossierSyncImpl.setUuid(getUuid());
		dossierSyncImpl.setDossierSyncId(getDossierSyncId());
		dossierSyncImpl.setGroupId(getGroupId());
		dossierSyncImpl.setUserId(getUserId());
		dossierSyncImpl.setCreateDate(getCreateDate());
		dossierSyncImpl.setModifiedDate(getModifiedDate());
		dossierSyncImpl.setDossierId(getDossierId());
		dossierSyncImpl.setDossierRefUid(getDossierRefUid());
		dossierSyncImpl.setSyncRefUid(getSyncRefUid());
		dossierSyncImpl.setDossierActionId(getDossierActionId());
		dossierSyncImpl.setActionCode(getActionCode());
		dossierSyncImpl.setActionName(getActionName());
		dossierSyncImpl.setActionUser(getActionUser());
		dossierSyncImpl.setActionNote(getActionNote());
		dossierSyncImpl.setSyncType(getSyncType());
		dossierSyncImpl.setInfoType(getInfoType());
		dossierSyncImpl.setPayload(getPayload());
		dossierSyncImpl.setServerNo(getServerNo());
		dossierSyncImpl.setState(getState());
		dossierSyncImpl.setRetry(getRetry());
		dossierSyncImpl.setMessageText(getMessageText());
		dossierSyncImpl.setAcknowlegement(getAcknowlegement());

		dossierSyncImpl.resetOriginalValues();

		return dossierSyncImpl;
	}

	@Override
	public int compareTo(DossierSync dossierSync) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				dossierSync.getModifiedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierSync)) {
			return false;
		}

		DossierSync dossierSync = (DossierSync)obj;

		long primaryKey = dossierSync.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		DossierSyncModelImpl dossierSyncModelImpl = this;

		dossierSyncModelImpl._originalUuid = dossierSyncModelImpl._uuid;

		dossierSyncModelImpl._originalGroupId = dossierSyncModelImpl._groupId;

		dossierSyncModelImpl._setOriginalGroupId = false;

		dossierSyncModelImpl._setModifiedDate = false;

		dossierSyncModelImpl._originalDossierRefUid = dossierSyncModelImpl._dossierRefUid;

		dossierSyncModelImpl._originalActionCode = dossierSyncModelImpl._actionCode;

		dossierSyncModelImpl._originalSyncType = dossierSyncModelImpl._syncType;

		dossierSyncModelImpl._setOriginalSyncType = false;

		dossierSyncModelImpl._originalInfoType = dossierSyncModelImpl._infoType;

		dossierSyncModelImpl._setOriginalInfoType = false;

		dossierSyncModelImpl._originalState = dossierSyncModelImpl._state;

		dossierSyncModelImpl._setOriginalState = false;

		dossierSyncModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DossierSync> toCacheModel() {
		DossierSyncCacheModel dossierSyncCacheModel = new DossierSyncCacheModel();

		dossierSyncCacheModel.uuid = getUuid();

		String uuid = dossierSyncCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			dossierSyncCacheModel.uuid = null;
		}

		dossierSyncCacheModel.DossierSyncId = getDossierSyncId();

		dossierSyncCacheModel.groupId = getGroupId();

		dossierSyncCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			dossierSyncCacheModel.createDate = createDate.getTime();
		}
		else {
			dossierSyncCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			dossierSyncCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			dossierSyncCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		dossierSyncCacheModel.dossierId = getDossierId();

		dossierSyncCacheModel.dossierRefUid = getDossierRefUid();

		String dossierRefUid = dossierSyncCacheModel.dossierRefUid;

		if ((dossierRefUid != null) && (dossierRefUid.length() == 0)) {
			dossierSyncCacheModel.dossierRefUid = null;
		}

		dossierSyncCacheModel.syncRefUid = getSyncRefUid();

		String syncRefUid = dossierSyncCacheModel.syncRefUid;

		if ((syncRefUid != null) && (syncRefUid.length() == 0)) {
			dossierSyncCacheModel.syncRefUid = null;
		}

		dossierSyncCacheModel.dossierActionId = getDossierActionId();

		dossierSyncCacheModel.actionCode = getActionCode();

		String actionCode = dossierSyncCacheModel.actionCode;

		if ((actionCode != null) && (actionCode.length() == 0)) {
			dossierSyncCacheModel.actionCode = null;
		}

		dossierSyncCacheModel.actionName = getActionName();

		String actionName = dossierSyncCacheModel.actionName;

		if ((actionName != null) && (actionName.length() == 0)) {
			dossierSyncCacheModel.actionName = null;
		}

		dossierSyncCacheModel.actionUser = getActionUser();

		String actionUser = dossierSyncCacheModel.actionUser;

		if ((actionUser != null) && (actionUser.length() == 0)) {
			dossierSyncCacheModel.actionUser = null;
		}

		dossierSyncCacheModel.actionNote = getActionNote();

		String actionNote = dossierSyncCacheModel.actionNote;

		if ((actionNote != null) && (actionNote.length() == 0)) {
			dossierSyncCacheModel.actionNote = null;
		}

		dossierSyncCacheModel.syncType = getSyncType();

		dossierSyncCacheModel.infoType = getInfoType();

		dossierSyncCacheModel.payload = getPayload();

		String payload = dossierSyncCacheModel.payload;

		if ((payload != null) && (payload.length() == 0)) {
			dossierSyncCacheModel.payload = null;
		}

		dossierSyncCacheModel.serverNo = getServerNo();

		String serverNo = dossierSyncCacheModel.serverNo;

		if ((serverNo != null) && (serverNo.length() == 0)) {
			dossierSyncCacheModel.serverNo = null;
		}

		dossierSyncCacheModel.state = getState();

		dossierSyncCacheModel.retry = getRetry();

		dossierSyncCacheModel.messageText = getMessageText();

		String messageText = dossierSyncCacheModel.messageText;

		if ((messageText != null) && (messageText.length() == 0)) {
			dossierSyncCacheModel.messageText = null;
		}

		dossierSyncCacheModel.acknowlegement = getAcknowlegement();

		String acknowlegement = dossierSyncCacheModel.acknowlegement;

		if ((acknowlegement != null) && (acknowlegement.length() == 0)) {
			dossierSyncCacheModel.acknowlegement = null;
		}

		return dossierSyncCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", DossierSyncId=");
		sb.append(getDossierSyncId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", dossierRefUid=");
		sb.append(getDossierRefUid());
		sb.append(", syncRefUid=");
		sb.append(getSyncRefUid());
		sb.append(", dossierActionId=");
		sb.append(getDossierActionId());
		sb.append(", actionCode=");
		sb.append(getActionCode());
		sb.append(", actionName=");
		sb.append(getActionName());
		sb.append(", actionUser=");
		sb.append(getActionUser());
		sb.append(", actionNote=");
		sb.append(getActionNote());
		sb.append(", syncType=");
		sb.append(getSyncType());
		sb.append(", infoType=");
		sb.append(getInfoType());
		sb.append(", payload=");
		sb.append(getPayload());
		sb.append(", serverNo=");
		sb.append(getServerNo());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", retry=");
		sb.append(getRetry());
		sb.append(", messageText=");
		sb.append(getMessageText());
		sb.append(", acknowlegement=");
		sb.append(getAcknowlegement());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("org.opencps.dossiermgt.model.DossierSync");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>DossierSyncId</column-name><column-value><![CDATA[");
		sb.append(getDossierSyncId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierRefUid</column-name><column-value><![CDATA[");
		sb.append(getDossierRefUid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncRefUid</column-name><column-value><![CDATA[");
		sb.append(getSyncRefUid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierActionId</column-name><column-value><![CDATA[");
		sb.append(getDossierActionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionCode</column-name><column-value><![CDATA[");
		sb.append(getActionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionName</column-name><column-value><![CDATA[");
		sb.append(getActionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionUser</column-name><column-value><![CDATA[");
		sb.append(getActionUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionNote</column-name><column-value><![CDATA[");
		sb.append(getActionNote());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncType</column-name><column-value><![CDATA[");
		sb.append(getSyncType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>infoType</column-name><column-value><![CDATA[");
		sb.append(getInfoType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>payload</column-name><column-value><![CDATA[");
		sb.append(getPayload());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serverNo</column-name><column-value><![CDATA[");
		sb.append(getServerNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>retry</column-name><column-value><![CDATA[");
		sb.append(getRetry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>messageText</column-name><column-value><![CDATA[");
		sb.append(getMessageText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acknowlegement</column-name><column-value><![CDATA[");
		sb.append(getAcknowlegement());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = DossierSync.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierSync.class, ModelWrapper.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _DossierSyncId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _dossierId;
	private String _dossierRefUid;
	private String _originalDossierRefUid;
	private String _syncRefUid;
	private long _dossierActionId;
	private String _actionCode;
	private String _originalActionCode;
	private String _actionName;
	private String _actionUser;
	private String _actionNote;
	private int _syncType;
	private int _originalSyncType;
	private boolean _setOriginalSyncType;
	private int _infoType;
	private int _originalInfoType;
	private boolean _setOriginalInfoType;
	private String _payload;
	private String _serverNo;
	private int _state;
	private int _originalState;
	private boolean _setOriginalState;
	private int _retry;
	private String _messageText;
	private String _acknowlegement;
	private long _columnBitmask;
	private DossierSync _escapedModel;
}