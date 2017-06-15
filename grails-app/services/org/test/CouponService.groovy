package org.test

class CouponService {

    Coupon getCoupon(CouponRule couponRule) {
        return Coupon.findByRule(couponRule)
    }
}
