package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amazonaws.services.servicediscovery.AWSServiceDiscovery;
import com.amazonaws.services.servicediscovery.AWSServiceDiscoveryClientBuilder;
import com.amazonaws.services.servicediscovery.model.DiscoverInstancesRequest;
import com.amazonaws.services.servicediscovery.model.DiscoverInstancesResult;
import com.amazonaws.services.servicediscovery.model.HealthStatus;
import com.amazonaws.services.servicediscovery.model.HttpInstanceSummary;

@Service
public class CloudMapServiceLocationResolver {
	public String resolve() {
        final AWSServiceDiscovery awsServiceDiscovery = AWSServiceDiscoveryClientBuilder.defaultClient();
        final DiscoverInstancesRequest discoverInstancesRequest = new DiscoverInstancesRequest();

        discoverInstancesRequest.setNamespaceName("microservice-namespace");
        discoverInstancesRequest.setServiceName("microservice-client2");
        discoverInstancesRequest.setHealthStatus(HealthStatus.HEALTHY.name());

        final DiscoverInstancesResult discoverInstancesResult = awsServiceDiscovery.discoverInstances(discoverInstancesRequest);

        final List<HttpInstanceSummary> allInstances = discoverInstancesResult.getInstances();

        
//        final HttpInstanceSummary result = allInstances.get(RAND.nextInt(allInstances.size()));
//        return result.getAttributes().get(AWS_INSTANCE_IPV_4_ATTRIBUTE) + ":" + result.getAttributes().get(AWS_INSTANCE_PORT_ATTRIBUTE);
        
        return null;
    }
}
