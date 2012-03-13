My Public Maven Repository
==========================
This is my public maven repository hosted on Github. Currently, I am only using it for project archetypes but I will also use it to host my own libraries.


Archtypes
---------

In eclipse: `Window - Preferences - Maven - Archtypes - Add Remote Catalog...`

Catalog File:

	https://raw.github.com/Talon876/mavenrepo/master/releases/archetype-catalog.xml

Description:

	Talon876's public maven repo.
	
The following archetypes are available:

* `theawesomenexus-archetype-gui` -- An archetype used for creating a basic executable jar file which displays a JFrame.
* `theawesomenexus-archetype-slick` -- An archetype used for creating the skeleton of a project using Slick2D.
* `theawesomenexus-archetype-servlet` -- An archetype used for creating a basic servlet ready to go with annotations and Tomcat 7.

	
Libraries
---------

Add the following to your .pom file:

	<repositories>
		[...]
		<repository>
			<id>Talon876's libraries</id>
			<url>https://raw.github.com/Talon876/mavenrepo/master/releases</url>
		</repository>
	</repositories>
	