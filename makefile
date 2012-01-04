# Copyright (c) 2012 Martin Ueding <dev@martin-ueding.de>

javafiles:=$(wildcard *.java)
classfiles:=$(javafiles:.java=.class)
properties:=$(wildcard *.properties)

affinator.jar: $(classfiles) $(properties) manifest.mf
	jar -cfm $@ manifest.mf $(classfiles) $(properties)

%.class: %.java
	javac $<

.PHONY: clean
clean:
	$(RM) *.class *.jar
