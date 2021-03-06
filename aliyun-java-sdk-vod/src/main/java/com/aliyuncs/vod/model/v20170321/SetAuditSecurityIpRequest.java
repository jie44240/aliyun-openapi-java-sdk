/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetAuditSecurityIpRequest extends RpcAcsRequest<SetAuditSecurityIpResponse> {
	
	public SetAuditSecurityIpRequest() {
		super("vod", "2017-03-21", "SetAuditSecurityIp", "vod");
	}

	private String operateMode;

	private String securityGroupName;

	private String ips;

	public String getOperateMode() {
		return this.operateMode;
	}

	public void setOperateMode(String operateMode) {
		this.operateMode = operateMode;
		if(operateMode != null){
			putQueryParameter("OperateMode", operateMode);
		}
	}

	public String getSecurityGroupName() {
		return this.securityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		this.securityGroupName = securityGroupName;
		if(securityGroupName != null){
			putQueryParameter("SecurityGroupName", securityGroupName);
		}
	}

	public String getIps() {
		return this.ips;
	}

	public void setIps(String ips) {
		this.ips = ips;
		if(ips != null){
			putQueryParameter("Ips", ips);
		}
	}

	@Override
	public Class<SetAuditSecurityIpResponse> getResponseClass() {
		return SetAuditSecurityIpResponse.class;
	}

}
