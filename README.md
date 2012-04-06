My Public Maven Repository
==========================
This is my public maven repository hosted on Github. Currently, I am only using it for project archetypes but I will also use it to host my own libraries. I will also use it to host libraries which have not been hosted anywhere else.


Archetypes
---------

In eclipse: `Window > Preferences > Maven > Archtypes > Add Remote Catalog...`

* Catalog File: https://raw.github.com/Talon876/mavenrepo/master/releases/archetype-catalog.xml
* Description: Deflexicon Repo

Using my repository from the command line:
	
	mvn archetype:generate -DarchetypeCatalog=https://raw.github.com/Talon876/mavenrepo/master/releases/
	
The following archetypes are available:

* `theawesomenexus-archetype-gui` -- An archetype used for creating an executable jar file which displays a JFrame.
* `theawesomenexus-archetype-slick` -- An archetype used for creating the skeleton of a project using Slick2D.
* `theawesomenexus-archetype-servlet` -- An archetype used for creating a servlet ready to go with annotations and Tomcat 7.

	
Libraries
---------

Add the following to your .pom file:

	<repositories>
		[...]
		<repository>
			<id>com.theawesomenexus</id>
			<name>The Awesome Nexus</name>
			<url>https://raw.github.com/Talon876/mavenrepo/master/releases</url>
		</repository>
	</repositories>
	
Current Libraries:

* `com.skype.skype_win32` -- A fixed version of http://skype.sourceforge.jp/index.php?Skype%20API%20For%20Java%20(English)
	
Expect the following libraries to be added in the near future:

* `theawesomenexus.util.jar` -- A library containing random use fulctions such as generating a random number in a specified range, getting a random angle, doing the conversion between angles and Vector2's, LERPing, etc.

Example Commands
----------------

This will download the source to, compile, extract, and run the `theawesomenexus-archetype-slick` archetype:
	
	mvn archetype:generate -DarchetypeCatalog=https://raw.github.com/Talon876/mavenrepo/master/releases/ -DarchetypeArtifactId=theawesomenexus-archetype-slick -DarchetypeGroupId=com.theawesomenexus -DgroupId=com.test -DartifactId=TestProject -Dversion=1.0 -Dgoals=package -DinteractiveMode=false && cd TestProject\target && 7z x TestProject-1.0-release.zip && cd TestProject-1.0 && call run

Note: This Windows command only works if 7zip and maven are in your %PATH% environment variable.

Deploy a third party jar:
	
	mvn deploy:deploy-file -Durl=file:PATH_TO_LOCAL\mavenrepo\releases -Dfile=theirfile.jar -DgroupId=com.whatever -DartifactId=thing -Dversion=1.0 -Dpackaging=jar
