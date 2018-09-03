package com.poqstudio.app.client;

import android.content.Context;
import android.widget.ImageView;

import com.poqstudio.app.platform.model.BaseConfig;

/**
 * @deprecated This class should be provided by platform
 */
@Deprecated
public class TestPoqConfig extends BaseConfig {

    private static final ImageView.ScaleType scaleTypeAspectRatioImageView = ImageView.ScaleType.FIT_CENTER;

    public TestPoqConfig(final Context context) {
        super(context);
    }

    @Override
    public ImageView.ScaleType getScaleTypeAspectRatioImageView() {
        return scaleTypeAspectRatioImageView;
    }

}
