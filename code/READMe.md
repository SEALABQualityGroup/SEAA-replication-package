# On the impact of Performance Antipatterns in multi-objective software model refactoring optimization -- Code

This folder contains the Java source code. 
To run the Java code,

```mvn clean package -pl easier-uml -am -DskipTests -T4``` which installs the dependencies and generate the fat jar.

```java -jar easier-uml/target/easier-uml-0.6.3-jar-with-dependencies.jar @./easier-core/uml_config.ini```

The LWN solver must be installed on the machine. To install the LQN solver, please follow the offical installation instructions at [QN installation guide](https://github.com/layeredqueuing/V5).
