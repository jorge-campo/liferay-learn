package com.acme.j1c2.internal.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceWrapper;

import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = ServiceWrapper.class)
public class J1C2UserLocalServiceOverride extends UserLocalServiceWrapper {

	public J1C2UserLocalServiceOverride() {
		super(null);
	}

	@Override
	public int authenticateByEmailAddress(
			long companyId, String emailAddress, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap,
			Map<String, Object> resultsMap)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"This is the J1C2 Implementation authenticateByEmailAddress " +
					"method");
		}

		return super.authenticateByEmailAddress(
			companyId, emailAddress, password, headerMap, parameterMap,
			resultsMap);
	}

	@Override
	public User getUser(long userId) throws PortalException {
		if (_log.isWarnEnabled()) {
			_log.warn("This is the J1C2 Implementation getUser method");
		}

		return super.getUser(userId);
	}

	@Reference(unbind = "-")
	private void _serviceSetter(UserLocalService userLocalService) {
		setWrappedService(userLocalService);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		J1C2UserLocalServiceOverride.class);

}