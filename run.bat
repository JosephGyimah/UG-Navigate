@echo off
echo University of Ghana - Campus Route Finder
echo =========================================
echo.

echo Checking Java installation...
java -version >nul 2>&1
if errorlevel 1 (
    echo ERROR: Java is not installed or not in PATH
    echo Please install Java 8 or higher and try again
    pause
    exit /b 1
)

echo Compiling Java files...
javac *.java
if errorlevel 1 (
    echo ERROR: Compilation failed
    echo Please check that you have JDK installed (not just JRE)
    echo Download from: https://adoptopenjdk.net/
    pause
    exit /b 1
)

echo Compilation successful!
echo.
echo Starting University of Ghana Campus Route Finder...
echo.
echo Features:
echo - 5 different route options on campus
echo - Real campus landmarks (Great Hall, Balme Library, Halls)
echo - Distance and time calculations
echo - Landmark filtering and route sorting
echo.
java Main

echo.
echo Application closed.
pause 