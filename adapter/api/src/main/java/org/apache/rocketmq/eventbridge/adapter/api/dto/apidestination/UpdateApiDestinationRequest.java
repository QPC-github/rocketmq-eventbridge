/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.eventbridge.adapter.api.dto.apidestination;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.rocketmq.eventbridge.adapter.api.dto.BaseResponse;
import org.apache.rocketmq.eventbridge.domain.model.apidestination.parameter.HttpApiParameters;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class UpdateApiDestinationRequest extends BaseResponse {

    @NotBlank(message = "ApiDestinationName is blank")
    @SerializedName("ApiDestinationName")
    private String apiDestinationName;

    @SerializedName("ConnectionName")
    private String connectionName;

    @SerializedName("Description")
    private String description;

    @Valid
    @SerializedName("HttpApiParameters")
    private HttpApiParameters httpApiParameters;

    @SerializedName("InvocationRateLimitPerSecond")
    private Integer invocationRateLimitPerSecond;
}
