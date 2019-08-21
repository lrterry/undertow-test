#!/bin/bash

gradle build
gradle shadowJar

docker build .
