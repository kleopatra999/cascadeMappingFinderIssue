package org.test

import grails.test.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

@Integration
@Rollback
class CouponServiceIntegrationSpec extends Specification {

    def couponService

    void "get the correct Coupon based on a given CouponRule"() {
        def cr = new CouponRule().save()
        def coupon = new Coupon(rule: cr).save(flush: true, failOnError: true)

        expect:
        couponService.getCoupon(cr) == coupon
    }
}
