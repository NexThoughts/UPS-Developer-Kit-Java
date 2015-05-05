# UPS-Developer-Kit-Java


As Mentioned here: http://stackoverflow.com/questions/3524443/ups-developer-api-missing-ja

So you have to copy the following six files to the same folder

$mkdir ups_ship && cd ups_ship

$ls -1

common.xsd

Error1.1.xsd

IFWS.xsd

ShipWebServiceSchema.xsd

Ship.wsdl

UPSSecurity.xsd

$ wsimport.sh -verbose -keep -extension -target 2.0 Ship.wsdl

##Generated code:

$ ls -1 com/ups/wsdl/xoltws/ship/v1/

ShipAcceptErrorMessage.class

ShipAcceptErrorMessage.java

ShipConfirmErrorMessage.class

ShipConfirmErrorMessage.java

ShipmentErrorMessage.class

ShipmentErrorMessage.java

ShipPortType.class

ShipPortType.java

ShipService.class

ShipService.java


## Now you can put all your *.class files in a package and use it in your project:

$jar cvf com_ups_wsdl_xoltws_ship_v1.jar ./com/ups/wsdl/xoltws/ship/v1/*.class

Your new jar:

$jar tf com_ups_wsdl_xoltws_ship_v1.jar
META-INF/
META-INF/MANIFEST.MF
com/ups/wsdl/xoltws/ship/v1/ShipAcceptErrorMessage.class
com/ups/wsdl/xoltws/ship/v1/ShipConfirmErrorMessage.class
com/ups/wsdl/xoltws/ship/v1/ShipmentErrorMessage.class
com/ups/wsdl/xoltws/ship/v1/ShipPortType.class
com/ups/wsdl/xoltws/ship/v1/ShipService.class
