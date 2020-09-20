# Promo Engine
- Idea is to build a Promo Engine which could be applied to the cart line items
- Followed TDD, as it's a Demo project wrote basic test cases but can be extended to different combination of products.

## Approach 
- Depending on the ProductTypes in the order, we pick the copun from the factory pattern
- This coupon will be passed to the PromoEngineCalculator and the promo price is calculated depending on the quantity
- First we calculate the price of the individual product
- Then for Order, we accumulate the sum of individual orders

## To Be Done
- Coupon Factory can be still enhanced so that it makes users to define coupons more easily.
- Method can be provided to define a coupon 
     `Map<String,Coupoun> createCoupon(String promoCode, Coupon coupon)`
- And in Product class we can pick the coupon
- Logic can also be performed by running Order against all the coupons and selecting the best coupon

## Git Details
- https://github.com/AruWipro/class-design.git
- Branch - promo-skelton
       