My Public Maven Repository
==========================
This is my public maven repository hosted on Github. Currently, I am only using it for project archetypes but I will also use it to host my own libraries.


Archetypes
---------

In eclipse: `Window > Preferences > Maven > Archtypes > Add Remote Catalog...`

* Catalog File: https://raw.github.com/Talon876/mavenrepo/master/releases/archetype-catalog.xml
* Description: The Awesome Nexus

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
	
Expect the following libraries to be added in the near future:

* `theawesomenexus.util.jar` -- A library containing random use fulctions such as generating a random number in a specified range, getting a random angle, doing the conversion between angles and Vector2's, LERPing, etc.
* `theawesomenexus.skype4java.jar` -- My fixed version of another person's library who hasn't updated in awhile.
