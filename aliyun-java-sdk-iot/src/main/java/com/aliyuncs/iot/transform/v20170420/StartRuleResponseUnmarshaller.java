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

package com.aliyuncs.iot.transform.v20170420;

import com.aliyuncs.iot.model.v20170420.StartRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartRuleResponseUnmarshaller {

	public static StartRuleResponse unmarshall(StartRuleResponse startRuleResponse, UnmarshallerContext context) {
		
		startRuleResponse.setRequestId(context.stringValue("StartRuleResponse.RequestId"));
		startRuleResponse.setSuccess(context.booleanValue("StartRuleResponse.Success"));
		startRuleResponse.setErrorMessage(context.stringValue("StartRuleResponse.ErrorMessage"));
	 
	 	return startRuleResponse;
	}
}