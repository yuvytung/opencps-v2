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

package org.opencps.dossiermgt.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.opencps.dossiermgt.model.ProcessSequence;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for ProcessSequence. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author huymq
 * @see ProcessSequenceLocalServiceUtil
 * @see org.opencps.dossiermgt.service.base.ProcessSequenceLocalServiceBaseImpl
 * @see org.opencps.dossiermgt.service.impl.ProcessSequenceLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ProcessSequenceLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProcessSequenceLocalServiceUtil} to access the process sequence local service. Add custom service methods to {@link org.opencps.dossiermgt.service.impl.ProcessSequenceLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ProcessSequence addProcessSequence(long userId, long groupId,
		long serviceProcessId, String sequenceNo, String sequenceName,
		double durationCount) throws PortalException;

	/**
	* Adds the process sequence to the database. Also notifies the appropriate model listeners.
	*
	* @param processSequence the process sequence
	* @return the process sequence that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ProcessSequence addProcessSequence(ProcessSequence processSequence);

	@Indexable(type = IndexableType.REINDEX)
	public ProcessSequence adminProcessData(JSONObject objectData);

	@Indexable(type = IndexableType.DELETE)
	public ProcessSequence adminProcessDelete(Long id);

	/**
	* Creates a new process sequence with the primary key. Does not add the process sequence to the database.
	*
	* @param processSequenceId the primary key for the new process sequence
	* @return the new process sequence
	*/
	@Transactional(enabled = false)
	public ProcessSequence createProcessSequence(long processSequenceId);

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	* Deletes the process sequence with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param processSequenceId the primary key of the process sequence
	* @return the process sequence that was removed
	* @throws PortalException if a process sequence with the primary key could not be found
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ProcessSequence deleteProcessSequence(long processSequenceId)
		throws PortalException;

	/**
	* Deletes the process sequence from the database. Also notifies the appropriate model listeners.
	*
	* @param processSequence the process sequence
	* @return the process sequence that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ProcessSequence deleteProcessSequence(
		ProcessSequence processSequence);

	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessSequenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessSequenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProcessSequence fetchProcessSequence(long processSequenceId);

	/**
	* Returns the process sequence matching the UUID and group.
	*
	* @param uuid the process sequence's UUID
	* @param groupId the primary key of the group
	* @return the matching process sequence, or <code>null</code> if a matching process sequence could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProcessSequence fetchProcessSequenceByUuidAndGroupId(String uuid,
		long groupId);

	public List<ProcessSequence> findByG_SN(long groupId, String sequenceNo);

	public ProcessSequence findBySID_SNO(long groupId, long serviceProcessId,
		String sequenceNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProcessSequence> getByServiceProcess(long groupId,
		long serviceProcessId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the process sequence with the primary key.
	*
	* @param processSequenceId the primary key of the process sequence
	* @return the process sequence
	* @throws PortalException if a process sequence with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProcessSequence getProcessSequence(long processSequenceId)
		throws PortalException;

	/**
	* Returns the process sequence matching the UUID and group.
	*
	* @param uuid the process sequence's UUID
	* @param groupId the primary key of the group
	* @return the matching process sequence
	* @throws PortalException if a matching process sequence could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ProcessSequence getProcessSequenceByUuidAndGroupId(String uuid,
		long groupId) throws PortalException;

	/**
	* Returns a range of all the process sequences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.ProcessSequenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of process sequences
	* @param end the upper bound of the range of process sequences (not inclusive)
	* @return the range of process sequences
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProcessSequence> getProcessSequences(int start, int end);

	/**
	* Returns all the process sequences matching the UUID and company.
	*
	* @param uuid the UUID of the process sequences
	* @param companyId the primary key of the company
	* @return the matching process sequences, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProcessSequence> getProcessSequencesByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	* Returns a range of process sequences matching the UUID and company.
	*
	* @param uuid the UUID of the process sequences
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of process sequences
	* @param end the upper bound of the range of process sequences (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching process sequences, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ProcessSequence> getProcessSequencesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ProcessSequence> orderByComparator);

	/**
	* Returns the number of process sequences.
	*
	* @return the number of process sequences
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getProcessSequencesCount();

	@Indexable(type = IndexableType.REINDEX)
	public ProcessSequence updateProcessSequence(long userId, long groupId,
		long processSequenceId, long serviceProcessId, String sequenceNo,
		String sequenceName, double durationCount) throws PortalException;

	/**
	* Updates the process sequence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param processSequence the process sequence
	* @return the process sequence that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ProcessSequence updateProcessSequence(
		ProcessSequence processSequence);

	@Indexable(type = IndexableType.REINDEX)
	public void updateProcessSequenceDB(long userId, long groupId,
		long serviceProcessId, String sequenceNo, String sequenceName,
		String sequenceRole, Double durationCount, ServiceContext serviceContext)
		throws PortalException;
}