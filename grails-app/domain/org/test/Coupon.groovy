package org.test

class Coupon {

    CouponRule rule

    static constraints = {
        rule(nullable: false)
    }

    static mapping = {
        rule cascade: 'save-update'
    }
}
