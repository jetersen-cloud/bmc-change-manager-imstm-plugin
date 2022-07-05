BMC AMI Change Manager for IMS TM 
Version 3.0.00

Copyright (c) 2020 BMC Software, Inc.


Jenkins plug-in Version 3.0.03 available here in .HPI format.

Installation instructions:
==========================
Navigate to Plugin Manager --> Advanced --> Upload Plugin.
Once the .hpi file is uploaded the plug-in will be ready for use, and it will be available under 'Add build step'.

Release Notes:
==========================
The plugin was developed against Jenkins version 2.277.1.
Two new fields were added to APPLCTN and DB resources: COPYACB and RELGSAM.
The Jelly entries for operands that are associated with different resources were changed to use optionalBlocks.