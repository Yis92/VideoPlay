package com.video.sunny.http;

/**
 * <p>Description: 连接信息</p>
 * <p>Company: 投资啦</p>
 * <p>Create Time:2015/8/17 9:51</p>
 *
 * @author MiaoWenHai
 */
public class URLConstants {


    //        public static String SERVER_URL = "http://192.168.1.147:3030/";//测试服务器服务地址
//    public static String WEIXIN_SERVER_URL = "http://192.168.1.147/";//测试服务器服务地址
    public static String SERVER_URL = "http://app.51tiancai.com/";//服务器服务地址
    public static String WEIXIN_SERVER_URL = "http://weixin.51tiancai.com/";//测试服务器服务地址


    public static final String IMG_VERIFY_CODE = SERVER_URL + "/v2-app-imgcaptcha/image-src"; //获取图形验证码
    public static final String CHECK_IMAGE_CODE = SERVER_URL + "/v2-app-imgcaptcha/check-code";//验证图形验证码

    public static final String SEND_SMS = SERVER_URL + "/v2-app-sms/send"; //获取短信验证码

    public static final String REGISTER = SERVER_URL + "/v2-app-sign-up/regist";//注册

    public static final String IDENTIFY = SERVER_URL + "/v2-app-verify/verify-id-card";  //身份认证

    public static final String LOGIN = SERVER_URL + "/v2-app-auth/login";//登录接口

    public static final String FRONT_PAGE = SERVER_URL + "/v2-app-home/index";//首页请求的参数

    public static final String TRADE_RECORD = SERVER_URL + "/v2-app-money-record/record";  //交易记录

    public static final String RETRIEVE_LOGIN_PASSWORD = SERVER_URL + "/v2-app-reset-password/reset";  //找回登录密码

    public static final String TRADE_PASSWORD_RESET = SERVER_URL + "/v2-app-reset-trading-password/modify";  //重置交易密码

    public static final String TRADE_PASSWORD_RETRIEVE = SERVER_URL + "/v2-app-find-trading-password/reset";  //找回交易密码

    public static final String MY_CURRENT = SERVER_URL + "/v2-app-my/current";//我的活期

    public static final String MY_FIXED = SERVER_URL + "/v2-app-my/fixed";//我的定期

    public static final String COUPON = SERVER_URL + "/v2-app-coupon/record";  //加息券|红包
    public static final String COUPON_USE = SERVER_URL + "/v2-app-coupon/use";  //加息券使用

    public static final String INVEST_READY = SERVER_URL + "/v2-app-invest/limit"; //投资准备

    public static final String INVEST_COMFIRM = SERVER_URL + "/v2-app-invest/confirm";  //投资确认,订单确认

    public static final String PAY = SERVER_URL + "/v2-app-invest/pay";//买入确认

    public static final String REDEM_LIMIT = SERVER_URL + "/v2-app-redeem/limit";  //赎回准备

    public static final String REDEM_CONFIRM = SERVER_URL + "/v2-app-redeem/confirm";  //赎回确认

    public static final String WITHDRAW_LIMIT = SERVER_URL + "/v2-app-withdraw/limit"; //提现准备，获取提现金额和提现手续费

    public static final String WITHDRAW_CONFIRM = SERVER_URL + "/v2-app-withdraw/confirm"; //确认提现

    public static final String DONE_FIXED = SERVER_URL + "/v2-app-my/done-fixed";  //我的定期已完成投资

    public static final String BUNNER = SERVER_URL + "/v2-app-banner/info"; //轮播图地址

    public static final String FEED_BACK = SERVER_URL + "/v2-app-feed-back/store"; //意见反馈

    public static final String ABOUT_SAFE = SERVER_URL + "/about/app-safe"; //安全保障图片
    public static final String ABOUT_TIANCAIBAO = SERVER_URL + "/about/online-notice"; //安全保障图片
    public static final String ABOUT_SAFE_TEXT = SERVER_URL + "/about/safe?type=app"; //安全保障文字
    public static final String ABOUT_CURRENT = SERVER_URL + "/about/current?type=app"; //活期
    public static final String ABOUT_FIXED = SERVER_URL + "/about/fixed?type=app"; //定期
    public static final String ABOUT_RECHARGE = SERVER_URL + "/about/recharge?type=app"; //充值/提现
    public static final String ABOUT_IDCARD = SERVER_URL + "/about/idcard?type=app"; //实名认证/银行卡
    public static final String ABOUT_COUPON = SERVER_URL + "/about/credit?type=app"; //加息券/红包
    public static final String ABOUT_TALENTVALUE = SERVER_URL + "/about/talentvalue?type=app"; //天才值/购买额度
    public static final String ABOUT_INVESTDRAW = SERVER_URL + "/about/investdraw?type=app"; //购买/赎回


    public static final String BANKQUOTA = SERVER_URL + "/jump/quota";//显示银行限额页面地址
    public static final String MEMBERS_GRADE = SERVER_URL + "/my_center/members-grade";//显示会员体系页面地址

    public static final String BINDCARD_LOAD = SERVER_URL + "/v2-app-bindbank-card/load";//绑卡准备
    public static final String BINDCARD_BIND = SERVER_URL + "/v2-app-bindbank-card/bind";//绑卡确认
    public static final String BINDCARD_GET_CODE = SERVER_URL + "/v2-app-bindbank-card/code";//绑卡获取手机验证码

    public static final String QUERY_ORDER_STATUS = SERVER_URL + "/v2-app-public/query-order";//获取订单状态

    public static final String NOTICE = SERVER_URL + "/v2-app-my/message-all";
    public static final String UNBIND_BANKCARD = SERVER_URL + "/v2-app-my/un-bank-card";
    public static final String UNBIND_BANKCARD_ADVANCE = SERVER_URL + "/v2-app-my/un-bank-card-advance";

    public static final String PROTOCOL_GET = SERVER_URL + "/public/contract";//获取协议地址

    public static final String SHARE = WEIXIN_SERVER_URL + "/sign-up/invite?inviter=";//分享地址
    public static final String INTEGRAL_HOW_GET = WEIXIN_SERVER_URL + "/shop/shop-tastes?type=app";
}
