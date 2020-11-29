Example usage:


```
mvn -B archetype:generate -DarchetypeGroupId=org.apache.camel.archetypes -DarchetypeArtifactId=camel-archetype-test-infra -DarchetypeVersion=3.7.0-SNAPSHOT  -DgroupId=org.camel.test.infra.hbase -Dpackage=org.apache.camel.test.infra.hbase -DartifactId=camel-test-infra-hbase -Dname=HBase
```

Deploy:

```
mvn deploy -DaltDeploymentRepository=local-snapshots::default::http://host:8081/artifactory/repo
```