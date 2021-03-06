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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeETLJobStageOutputSchemaResponse;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobStageOutputSchemaResponse.Schema;
import com.aliyuncs.emr.model.v20160408.DescribeETLJobStageOutputSchemaResponse.Schema.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeETLJobStageOutputSchemaResponseUnmarshaller {

	public static DescribeETLJobStageOutputSchemaResponse unmarshall(DescribeETLJobStageOutputSchemaResponse describeETLJobStageOutputSchemaResponse, UnmarshallerContext context) {
		
		describeETLJobStageOutputSchemaResponse.setRequestId(context.stringValue("DescribeETLJobStageOutputSchemaResponse.RequestId"));

		Schema schema = new Schema();
		schema.setName(context.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Name"));

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < context.lengthValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields.Length"); i++) {
			Field field = new Field();
			field.setType(context.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].Type"));
			field.setName(context.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].Name"));
			field.setIndex(context.integerValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].Index"));
			field.setRawType(context.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].RawType"));
			field.setAssignType(context.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].AssignType"));
			field.setAssignValue(context.stringValue("DescribeETLJobStageOutputSchemaResponse.Schema.Fields["+ i +"].AssignValue"));

			fields.add(field);
		}
		schema.setFields(fields);
		describeETLJobStageOutputSchemaResponse.setSchema(schema);
	 
	 	return describeETLJobStageOutputSchemaResponse;
	}
}