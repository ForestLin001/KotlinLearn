package com.kotlin.leran.design.proxy.dynamic.jdk

/**
 * Desc           :  买机票
 * Author         :  Jetictors
 * Time           :  2019-12-13  11:24
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class Plane : IDynamicTicket {

    override fun buyTicket(travel: String, price: Double) {
        println("我买机票, 行程为： ${travel}, 价格是：${price}元")
        println("买票中")
        println("...")
    }

}
