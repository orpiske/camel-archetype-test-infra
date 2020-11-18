## ------------------------------------------------------------------------
## Licensed to the Apache Software Foundation (ASF) under one or more
## contributor license agreements.  See the NOTICE file distributed with
## this work for additional information regarding copyright ownership.
## The ASF licenses this file to You under the Apache License, Version 2.0
## (the "License"); you may not use this file except in compliance with
## the License.  You may obtain a copy of the License at
##
## http://www.apache.org/licenses/LICENSE-2.0
##
## Unless required by applicable law or agreed to in writing, software
## distributed under the License is distributed on an "AS IS" BASIS,
## WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
## See the License for the specific language governing permissions and
## limitations under the License.
## ------------------------------------------------------------------------
package ${package};

import org.apache.camel.test.infra.common.services.ContainerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.containers.GenericContainer;


public class ${name}LocalContainerService implements ${name}Service, ContainerService<GenericContainer> {
    private static final Logger LOG = LoggerFactory.getLogger(${name}LocalContainerService.class);

    private GenericContainer container;

    public ${name}LocalContainerService() {
        String containerName = System.getProperty("${name.toLowerCase()}.container");

        container = new GenericContainer(containerName);
    }


    @Override
    public void registerProperties() {

    }


    @Override
    public void initialize() {
        LOG.info("Trying to start the ${name} container");
        container.start();

        registerProperties();

        // Uncomment and replace with the actual address used to access the server
        // LOG.info("${name} instance running at {}", getServiceAddress());
    }

    @Override
    public void shutdown() {
        LOG.info("Stopping the ${name} container");
        container.stop();
    }

    @Override
    public GenericContainer getContainer() {
        return container;
    }
}
