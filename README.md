# Pan-Aadhaar Matcher App

## Overview

The Pan-Aadhaar Matcher App is a Java-based application designed to match Permanent Account Numbers (PAN) with Aadhaar numbers. The application uses a simple console-based interface to input Aadhaar numbers and retrieve corresponding PAN details.

## Features

* Matches Aadhaar numbers with PAN details
* Simple console-based interface for user input
* Retrieves PAN details, including PAN number, Aadhaar number, bank details, and investment information

## Technologies Used

* Java programming language
* Java Collections Framework (HashMap)

## Installation

To run the application, simply compile the Java files and execute the PanAadhaarMatcherApp class.

## Usage

1. Run the PanAadhaarMatcherApp class.
2. Enter an Aadhaar number when prompted.
3. The application will retrieve and display the corresponding PAN details, if found.

## Code Structure

The code is organized into several classes, each representing a different entity in the system:

* `Aadhaar.java`: Represents an Aadhaar object with attributes such as Aadhaar number, name, father's name, and address.
* `AadhaarService.java`: Represents a service class that provides methods to retrieve Aadhaar objects by Aadhaar number.
* `Pan.java`: Represents a PAN object with attributes such as PAN number, Aadhaar number, bank details, and investment information.
* `PanService.java`: Represents a service class that provides methods to retrieve PAN objects by Aadhaar number.
* `PanAadhaarMatcherApp.java`: The main application class that interacts with the user and utilizes the AadhaarService and PanService classes to match Aadhaar numbers with PAN details.

## Contributing

Contributions are welcome! If you'd like to contribute to the project, please fork the repository and submit a pull request with your changes.

## License

The MIT License (MIT)

Copyright (c) 2025 Satyam Vashistha

Permission is hereby granted to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY.