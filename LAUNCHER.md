# Quick Launch Guide - University of Ghana Campus Route Finder

## Current Situation
You have Java 8 Runtime Environment (JRE) installed, but not the Development Kit (JDK) with the `javac` compiler.

## About the Application
This is a **University of Ghana Campus Route Finder** specifically designed for the Legon campus. It helps students, staff, and visitors navigate between campus buildings with:
- 5 different route options
- Real campus landmarks (Great Hall, Balme Library, Halls of Residence)
- Distance and time calculations
- Landmark filtering and route sorting

## Quick Solutions

### Option 1: Use an IDE (Recommended for now)
1. **Download IntelliJ IDEA Community Edition** (Free)
   - Go to: https://www.jetbrains.com/idea/download/
   - Choose "Community Edition"
   - Install and run

2. **Create New Project**
   - File → New → Project
   - Choose "Java" → "No Build Tools"
   - Set project name: "UG_CampusRouteFinder"

3. **Add Source Files**
   - Right-click on `src` folder
   - Copy all `.java` files into the `src` folder
   - Right-click on `Main.java` → "Run 'Main.main()'"

### Option 2: Online Java Compiler
1. Go to: https://replit.com/
2. Create new Java project
3. Upload all `.java` files
4. Click "Run"

### Option 3: Install JDK (Best long-term solution)
1. Download OpenJDK from: https://adoptopenjdk.net/
2. Install and add to PATH
3. Then you can use: `javac *.java` and `java Main`

## What You'll See When Running

The application will open with:
- **Input Panel**: Enter start location, destination, and optional landmarks on University of Ghana campus
- **Route Results**: Table showing 5 routes with distance, time, and landmarks
- **Sorting Options**: Buttons to sort by distance or time
- **Map Display**: Visual representation of routes through campus
- **Clear Function**: Reset all inputs and results

## University of Ghana Campus Data Included

The app comes with real campus locations:
- **Start**: Main Gate (Legon) - Main campus entrance
- **Destination**: Balme Library - Main university library
- **Landmarks**: Great Hall, Commonwealth Hall, Volta Hall, Mensah Sarbah Hall, Akuafo Hall

### Campus Landmarks
- **Main Gate (Legon)**: Main entrance to the campus
- **Great Hall**: Central ceremonial and administrative building
- **Balme Library**: Main university library
- **Commonwealth Hall**: Student residence hall
- **Volta Hall**: Student residence hall
- **Mensah Sarbah Hall**: Student residence hall
- **Akuafo Hall**: Student residence hall

## Features to Test

1. **Find Routes**: Click "Find Routes" button to see 5 campus routes
2. **Sort by Distance**: Arrange routes from shortest to longest
3. **Sort by Time**: Arrange routes from fastest to slowest
4. **Landmark Search**: Enter "Great Hall" to see routes passing through it
5. **Clear All**: Reset everything with one click

## Sample Routes You'll See

1. **Direct Route**: Main Gate → Great Hall → Balme Library (1.8km, 12 min)
2. **Scenic Route**: Main Gate → Commonwealth Hall → Great Hall → Balme Library (2.4km, 18 min)
3. **Alternative Route**: Main Gate → Volta Hall → Great Hall → Balme Library (2.1km, 15 min)
4. **Extended Route**: Main Gate → Mensah Sarbah Hall → Great Hall → Balme Library (2.7km, 20 min)
5. **Quick Route**: Main Gate → Akuafo Hall → Great Hall → Balme Library (2.3km, 16 min)

## Troubleshooting

- **App won't start**: Check Java version (Java 8+ required)
- **No routes shown**: Make sure start and destination are filled
- **UI looks wrong**: Try resizing the window

## Next Steps

1. **Test the application** using one of the options above
2. **Install JDK** for future development
3. **Customize** the routes and locations for specific campus needs
4. **Integrate** with your backend routing algorithms
5. **Add more landmarks** like lecture halls, cafeterias, and sports facilities

## Campus Navigation Tips

- **Great Hall** is the central landmark connecting most routes
- **Balme Library** is a major destination for students
- **Halls of Residence** are strategically located for route variety
- **Walking times** are based on average walking speed on campus
- **Distances** are calculated using campus pathways

---

**Need Help?** Check the `SETUP_GUIDE.md` file for detailed instructions. 