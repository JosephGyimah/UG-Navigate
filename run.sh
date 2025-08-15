#!/bin/bash

echo "University of Ghana - Campus Route Finder"
echo "========================================="
echo

echo "Checking Java installation..."
if ! command -v java &> /dev/null; then
    echo "ERROR: Java is not installed or not in PATH"
    echo "Please install Java 8 or higher and try again"
    exit 1
fi

echo "Java version:"
java -version
echo

echo "Compiling Java files..."
if ! javac *.java; then
    echo "ERROR: Compilation failed"
    echo "Please check that you have JDK installed (not just JRE)"
    echo "Download from: https://adoptopenjdk.net/"
    exit 1
fi

echo "Compilation successful!"
echo
echo "Starting University of Ghana Campus Route Finder..."
echo
echo "Features:"
echo "- 5 different route options on campus"
echo "- Real campus landmarks (Great Hall, Balme Library, Halls)"
echo "- Distance and time calculations"
echo "- Landmark filtering and route sorting"
echo
java Main

echo
echo "Application closed." 