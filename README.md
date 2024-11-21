# Strategy Design Pattern

Problem Statement: Payment Processor Implementation

You are tasked with designing a flexible and scalable payment processor for an e-commerce platform. The platform supports multiple payment methods like Credit Card, PayPal, and UPI, and more methods may be added in the future.

Requirements:
1. Ensure that the addition of new payment methods doesn’t require changes to the existing codebase.
2. Allow customers to switch between payment methods seamlessly.
3. Write clean, maintainable, and reusable code to handle payment processing logic.

Key Considerations:
Use the Strategy design pattern to encapsulate the payment methods' behaviors.
Implement an interface or abstract class for all payment methods.
Provide an easy-to-use mechanism for the client to select and execute the desired payment strategy.
