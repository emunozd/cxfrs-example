Camel CXFRS Example: Camel route with CXFRS consumer endpoint
=====================================================================

Author: Elkin Munoz

Technologies: Fuse, OSGi, Camel, CXF, Blueprint

Product: Fuse 6.3

Breakdown
---------
This code example demonstrates how to create a CXFRS consumer in Blueprint.

For more information see:

* <https://access.redhat.com/site/documentation/JBoss_Fuse/> for more information about using JBoss Fuse
* <http://camel.apache.org/cxfrs.html> for more information about the CXFRS component in camel

System Requirements
-------------------
Before building and running this project you need:

* Maven 3.2 or higher
* JDK 1.7 or 1.8
* JBoss Fuse 6.3

Build and Deploy
----------------

1) clone this project

git clone https://github.com/emunozd/cxfrs-example.git

2) change to project directory

cd cxfrs-example

3) build

mvn clean install

4) Start JBoss Fuse 6.3 on Karaf

./bin/fuse

5) Activate cxf feature

features:install cxf

Usage
-----

1) Open a web browser and make a request http://localhost:8181/cxf/person/personRest/example, where "example" is an id that you can change.
2) Check logs to check the route processing.

Done.
