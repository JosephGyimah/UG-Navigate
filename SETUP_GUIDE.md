# Setup Guide for University of Ghana Campus Route Finder

## Current Status
✅ **Java Runtime Environment (JRE)**: Installed (version 1.8.0_451)  
❌ **Java Development Kit (JDK)**: Not installed (missing `javac` compiler)

## About the Application
This is a **University of Ghana Campus Route Finder** that helps students, staff, and visitors navigate the Legon campus. It provides:
- 5 different route options between campus locations
- Real University of Ghana landmarks (Great Hall, Balme Library, Halls of Residence)
- Distance and time calculations
- Landmark filtering and route sorting

## Option 1: Install JDK (Recommended)

### Download and Install JDK
1. **Visit Oracle JDK**: Go to [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/)
2. **Download JDK 8 or higher**: Choose Windows x64 version
3. **Run Installer**: Follow the installation wizard
4. **Set PATH**: Add JDK bin directory to system PATH

### Alternative: OpenJDK
- **AdoptOpenJDK**: [https://adoptopenjdk.net/](https://adoptopenjdk.net/)
- **Amazon Corretto**: [https://aws.amazon.com/corretto/](https://aws.amazon.com/corretto/)

### Verify Installation
After installation, open a new command prompt and run:
```bash
javac -version
java -version
```

## Option 2: Use an IDE (Easiest)

### IntelliJ IDEA (Free Community Edition)
1. Download from [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
2. Install and create new Java project
3. Add all `.java` files to `src` folder
4. Run `Main.java`

### Eclipse IDE
1. Download from [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/)
2. Install and create new Java project
3. Add all `.java` files to `src` folder
4. Run `Main.java`

### NetBeans IDE
1. Download from [https://netbeans.apache.org/download/](https://netbeans.apache.org/download/)
2. Install and create new Java project
3. Add all `.java` files to `src` folder
4. Run `Main.java`

## Option 3: Online Java Compiler (Quick Test)

### Replit
1. Go to [https://replit.com/](https://replit.com/)
2. Create new Java project
3. Upload all `.java` files
4. Run the application

### JDoodle
1. Go to [https://www.jdoodle.com/online-java-compiler/](https://www.jdoodle.com/online-java-compiler/)
2. Copy and paste code from each file
3. Run to test functionality

## Quick Test Commands

Once JDK is installed, you can run:

```bash
# Compile all Java files
javac *.java

# Run the application
java Main

# Or use the batch file (Windows)
run.bat

# Or use the shell script (Unix/Linux/Mac)
chmod +x run.sh
./run.sh
```

## University of Ghana Campus Features

### Campus Landmarks Included
- **Main Gate (Legon)**: Main campus entrance
- **Great Hall**: Central administrative building
- **Balme Library**: Main university library
- **Commonwealth Hall**: Student residence
- **Volta Hall**: Student residence
- **Mensah Sarbah Hall**: Student residence
- **Akuafo Hall**: Student residence

### Route Options
The application generates 5 different routes between any two points, each passing through different landmarks to give users variety in their campus navigation.

## Troubleshooting

### "javac not recognized" Error
- JDK is not installed or not in PATH
- Solution: Install JDK and add to PATH

### "java not recognized" Error
- JRE is not installed or not in PATH
- Solution: Install JRE or JDK

### Compilation Errors
- Check Java version compatibility (Java 8+ required)
- Ensure all files are in the same directory
- Verify file encoding (should be UTF-8)

### Runtime Errors
- Check if all compiled `.class` files exist
- Ensure `Main.class` is present
- Verify Java version compatibility

## File Structure After Compilation

```
Location/
├── Main.java              # Source code
├── RouteFinderApp.java    # Source code
├── Route.java            # Source code
├── Main.class            # Compiled bytecode
├── RouteFinderApp.class  # Compiled bytecode
├── Route.class           # Compiled bytecode
├── run.bat               # Windows launcher
├── run.sh                # Unix launcher
├── README.md             # Documentation
├── SETUP_GUIDE.md        # This file
└── LAUNCHER.md           # Quick launch guide
```

## Next Steps

1. **Install JDK** (Option 1) or **Use IDE** (Option 2)
2. **Compile the application**: `javac *.java`
3. **Run the application**: `java Main`
4. **Test all features**:
   - Enter start/destination locations on University of Ghana campus
   - Search for routes between campus buildings
   - Sort by distance/time
   - Filter by landmarks
   - Clear results

## Support

If you encounter issues:
1. Check this setup guide
2. Verify Java installation
3. Try using an IDE
4. Check error messages for specific issues

---

**Note**: This application is specifically designed for the University of Ghana campus. For production use, integrate with actual backend routing algorithms and real campus data. 