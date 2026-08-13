# 🏦 Banking System & ATM Simulator

> **Robust Desktop Banking Application & ATM Simulator built in Java with Object-Oriented Architecture and MySQL Integration**

A full-featured Java desktop application simulating real-world banking operations, secure user onboarding, card PIN management, deposit/withdrawal transactions, fast cash access, and mini-statement logs.

---

## 📌 Overview

**Bank Management System** models an automated banking teller and desktop portal designed using modular Object-Oriented Programming (OOP) principles in Java. It provides user workflows for account lifecycle management:
- **Account Onboarding:** Multi-step signup forms (`Signup.java`, `Signup2.java`, `Signup3.java`) collecting personal identity, financial details, and service choices (ATM Card, Mobile Banking, E-Statements).
- **ATM Simulator Dashboard:** Interactive desktop UI simulating ATM terminal operations (`Login.java`, `Transactions.java`, `Deposit.java`, `Withdrawl.java`, `FastCash.java`, `Pin.java`).
- **Data Persistence:** Relational MySQL database logging customer profiles, account credentials, PIN hashes, and itemized transaction histories (`Conn.java`).

---

## ✨ Key Features

- 🔐 **Secure User Authentication:** Account login system verifying 16-digit card numbers and 4-digit PINs.
- 📋 **Multi-Stage Customer Onboarding:** 3-step registration gathering personal data, tax identification, and account types (Savings, Fixed Deposit, Current Account).
- 💸 **Deposit & Withdrawal Processing:** Real-time ledger balance updates with validation against overdrawing account limits.
- ⚡ **Fast Cash System:** Quick one-touch withdrawal presets ($100, $500, $1,000, $2,000, $5,000, $10,000).
- 🧾 **Mini-Statement Generation:** Itemized transaction history display (`MiniStatement.java`) showing past deposits and withdrawals.
- 🔑 **PIN Change Utility:** Secure PIN modification interface updating relational records dynamically.

---

## 🛠️ Tech Stack & Architecture

### **Technology Stack**
- **Language:** Java (JDK 17+)
- **UI Framework:** Java Swing (`JFrame`, `JLabel`, `JTextField`, `JRadioButton`, `JButton`), Java AWT
- **Database:** MySQL Server 8.0+
- **JDBC Driver:** MySQL Connector/J (`mysql-connector-java-8.0.28.jar`)
- **Third-Party UI Extensions:** JCalendar (`jcalendar-1.4.jar`) for date selection

### **Software Architecture**
The system uses a clean 3-tier desktop architectural pattern:
```
[ Swing GUI Layer (Frames & Views) ]  --->  [ Transaction Business Logic ]  --->  [ JDBC Data Access Layer (Conn.java) ]  --->  [ MySQL DB ]
```

---

## 📂 Project Structure

```
Bank-Management-System/
├── bank_management_system_code/
│   ├── src/ASimulatorSystem/
│   │   ├── Login.java           # Authentication screen
│   │   ├── Signup.java          # Personal details registration
│   │   ├── Signup2.java         # Financial background details
│   │   ├── Signup3.java         # Account & card services setup
│   │   ├── Transactions.java    # Main ATM option menu
│   │   ├── Deposit.java         # Cash deposit transaction logic
│   │   ├── Withdrawl.java       # Cash withdrawal transaction logic
│   │   ├── FastCash.java        # Quick withdrawal presets
│   │   ├── Pin.java             # Security PIN change interface
│   │   ├── MiniStatement.java   # Transaction ledger viewer
│   │   ├── BalanceEquiry.java   # Balance inquiry view
│   │   ├── Conn.java            # JDBC connection manager
│   │   └── icons/               # ATM UI image assets
│   ├── lib/                     # JDBC and JCalendar dependencies
│   └── build.xml
├── .gitignore
├── LICENSE
└── README.md
```

---

## 🚀 Setup & Execution Guide

### Prerequisites
- Java Development Kit (JDK 17 or higher)
- MySQL Server (v8.0 or higher)

### Database Configuration
1. Start your local MySQL Server instance.
2. Create the target database:
   ```sql
   CREATE DATABASE bankmanagementsystem;
   ```
3. Set your environment variables (or export them in your shell):
   ```bash
   export DB_URL="jdbc:mysql://localhost:3306/bankmanagementsystem"
   export DB_USER="root"
   export DB_PASS="your_mysql_password"
   ```

### Compilation & Running
1. **Clone the repository:**
   ```bash
   git clone https://github.com/BhavyAtkotiya/Bank-Management-System.git
   cd Bank-Management-System/bank_management_system_code
   ```
2. **Compile Java Source Files:**
   ```bash
   javac -cp "lib/*;src" src/ASimulatorSystem/Login.java -d bin/
   ```
3. **Launch Application:**
   ```bash
   java -cp "bin;lib/*" ASimulatorSystem.Login
   ```

---

## 📄 License

This project is open-source software licensed under the **MIT License** — see the [LICENSE](LICENSE) file.
