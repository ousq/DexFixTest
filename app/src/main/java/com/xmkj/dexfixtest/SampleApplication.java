package com.xmkj.dexfixtest;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * @name osx
 * @class name：com.xmkj.dexfixtest
 * @class describe
 * @time 2018/10/31 0031 10:04
 * @change
 * @chang time
 * @class describe
 */
public class SampleApplication extends TinkerApplication {
    protected SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.xmkj.dexfixtest.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
