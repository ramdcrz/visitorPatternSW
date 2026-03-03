# visitorPattern
**Seatwork: Telecommunication Subscription Plans**


This project implements the **Visitor Design Pattern** to manage and display different features of mobile telecommunications plans. The pattern allows us to add new operations on telco subscription objects without modifying their structure.

## Problem Statement

You are comparing mobile plans from three major Philippine telecommunication providers:

- **Smart**: 15 GB data allowance for ₱500/month • Per-use calls and texts
- **Globe**: 10 GB data allowance for ₱450/month • Unlimited calls and texts within their network
- **Dito**: 8 GB data allowance for ₱400/month • Unlimited calls and texts to all networks

The challenge is to display and compare various attributes (data allowance, pricing, unlimited offers) for each provider dynamically without hardcoding logic into the telco objects.

## Project Structure

```
src/
└── labSeatwork4/
    ├── Telco.java                      # Element: Concrete telco subscription
    ├── TelcoSubscription.java           # Element Interface: Accepts visitors
    ├── UsagePromo.java                  # Visitor Interface: Data allowance operations
    ├── TelcoAllowance.java              # Concrete Visitor: Data allowance implementation
    ├── UnliCallTextOffer.java           # Visitor Interface: Call/text offer operations
    ├── UnliCallsTextPackage.java        # Concrete Visitor: Call/text implementation
    └── TelcoPromo.java                  # Main: Demonstrates the pattern
```

## Design Pattern Structure

### 1. **Element Interface** - `TelcoSubscription`
Defines the `accept()` method that allows visitors to visit the telco object.

### 2. **Concrete Element** - `Telco`
Implements the `TelcoSubscription` interface. Stores telco-specific data and accepts visitors.

**Properties:**
- `telcoName`: Name of the provider
- `promoPrice`: Monthly price
- `dataAllowance`: GB data included
- `unliCallText`: Whether unlimited calls/texts are included

### 3. **Visitor Interfaces**
Define operations that can be performed on telco objects:

#### `UsagePromo`
#### `UnliCallTextOffer`


### 4. **Concrete Visitors**
Implement specific operations:

#### `TelcoAllowance` (Visitor for Data Usage)
Displays data allowance and pricing for each provider:
- Smart: 15 GB for ₱500
- Globe: 10 GB for ₱450
- Dito: 8 GB for ₱400

#### `UnliCallsTextPackage` (Visitor for Call/Text Offers)
Displays unlimited call/text offerings:
- Smart: No unlimited calls and text
- Globe: Unlimited calls and text
- Dito: Unlimited calls and text

## Execution Flow

1. Create telco objects with their specifications
2. Create visitor objects for different operations
3. Call `accept()` on telco objects, passing visitors
4. Visitors examine telco data and perform operations
5. Display results dynamically

## Sample Output

```
Smart Data Usage Offer and price: 15 GB for ₱500.0
Globe Data Usage Offer and price: 10 GB for ₱450.0
Dito Data Usage Offer and price: 8 GB for ₱400.0

Smart unlimited calls and text package: No unlimited calls and text
Globe unlimited calls and text package: Unlimited calls and text
Dito unlimited calls and text package: Unlimited calls and text
```

## Benefits of Visitor Pattern

✅ **Separation of Concerns**: Telco objects don't need to know about pricing or offer logic
✅ **Easy to Extend**: Add new operations without modifying existing telco classes
✅ **Centralized Operations**: All operations for a specific task are in one visitor class
✅ **Single Responsibility**: Each visitor handles one specific operation

## Example Walkthrough

```java
// Create telco objects
Telco smart = new Telco(15, 500, "Smart", false);

// Create visitor objects
UsagePromo promo = new TelcoAllowance();
UnliCallTextOffer unli = new UnliCallsTextPackage();

// Visitor visits the element
// Telco accepts the visitor and returns operation result
String dataOffer = smart.accept(promo, smart.getPromoPrice());
// Output: "15 GB for ₱500.0"

String callOffer = smart.accept(unli, smart.getUnliCallText());
// Output: "No unlimited calls and text"
```

## Key Concepts

| Concept | Implementation |
|---------|-----------------|
| **Element** | `TelcoSubscription` interface + `Telco` class |
| **Visitor** | `UsagePromo` and `UnliCallTextOffer` interfaces |
| **Concrete Visitor** | `TelcoAllowance`, `UnliCallsTextPackage` |
| **Accept Method** | `accept()` methods in `Telco` class |
| **Double Dispatch** | Pattern enables different behavior based on both telco and visitor type |

## Telco Provider Comparison

| Provider | Data | Price | Calls & Texts |
|----------|------|-------|---------------|
| Smart | 15 GB | ₱500 | No (Per-use) |
| Globe | 10 GB | ₱450 | Unlimited (within network) |
| Dito | 8 GB | ₱400 | Unlimited (all networks) |

## How to Run

Compile and run the main class:
```bash
javac src/labSeatwork4/*.java
java -cp src labSeatwork4.TelcoPromo
```

Or use your preferred Java IDE to execute `TelcoPromo.java`.

## Learning Outcomes

By completing this seatwork, you will understand:
- ✓ The Visitor Design Pattern and its implementation
- ✓ Double dispatch mechanism in object-oriented design
- ✓ Separating data structures from operations
- ✓ How to extend functionality without modifying existing classes
- ✓ Real-world applications of design patterns

## UML Diagram
![alt text](https://github.com/ramdcrz/visitorPatternSW/blob/main/visitorPatternSW_UML.jpg)
