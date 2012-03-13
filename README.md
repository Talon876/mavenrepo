My Public Maven Repository
==========================
This is my public maven repository hosted on Github. Currently, I am only using it for project archetypes but I will also use it to host my own libraries.


Archtypes
---------

In eclipse: Window - Preferences - Maven - Archtypes - Add Remote Catalog...

Catalog File:

	https://raw.github.com/Talon876/mavenrepo/master/releases/archetype-catalog.xml

Description:

	Talon876's public maven repo.
	
Libraries
---------

Add the following to your .pom file:

	<repositories>
		[...]
		<repository>
			<id>Talon876's libraries</id>
			<url>https://raw.github.com/Talon876/mavenrepo/master/releases/</url>
		</repository>
	</repositories>
	