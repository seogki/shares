package hong.dev.shares.Base;

import android.app.Activity;
import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.annotation.NonNull;
import android.view.View;

import hong.dev.shares.Common.Util.KeyboardUtils;
import hong.dev.shares.Common.Util.UtilMethod;


/**
 * Created by Seogki on 2018. 4. 12..
 */

public class BaseBindingAdapter {

//    @BindingAdapter("galleryImageUrl")
//    public static void galleryImage(final ImageView imageView, String url) {
//
//        Context context = imageView.getContext();
//        if (context == null) {
//            return;
//        } else if (context instanceof Activity) {
//            final Activity activity = (Activity) context;
//            if (activity.isFinishing() || activity.isDestroyed()) {
//                return;
//            }
//        }
//
//        if (url == null) {
//            Glide.with(imageView.getContext()).clear(imageView);
//            imageView.setImageDrawable(null);
//        } else {
//
//            Uri uri = Uri.parse("file://" + url);
//            Glide.with(imageView.getContext())
//                    .load(uri)
//                    .apply(new RequestOptions()
//                            .centerCrop()
//                            .override(175, 175)
//                            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC))
//                    .thumbnail(0.1f)
//                    .into(new SimpleTarget<Drawable>() {
//                        @Override
//                        public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
//                            imageView.setImageDrawable(resource);
//                        }
//                    });
//        }
//    }

    @BindingAdapter("keyboardDetect")
    public static void keyboardDetect(@NonNull final View view, final String data) {

        Context context = view.getContext();
        if (context == null) {
            return;
        } else if (context instanceof Activity) {
            final Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }


        if (UtilMethod.getActivity(view.getContext()) != null)
            KeyboardUtils.addKeyboardToggleListener(UtilMethod.getActivity(view.getContext()), new KeyboardUtils.SoftKeyboardToggleListener() {
                @Override
                public void onToggleSoftKeyboard(boolean isVisible) {
                    view.setVisibility(isVisible ? View.GONE : View.VISIBLE);
                }
            });

    }

//    @BindingAdapter("popularImage")
//    public static void popularImage(final ImageView view, final String result) {
//        Context context = view.getContext();
//        if (context == null) {
//            return;
//        } else if (context instanceof Activity) {
//            final Activity activity = (Activity) context;
//            if (activity.isFinishing() || activity.isDestroyed()) {
//                return;
//            }
//        }
//        if (result == null) {
//            Glide.with(context).clear(view);
//            view.setImageDrawable(null);
//        } else {
//            String end = result.replace("/","");
//            String murl = Const.Companion.getServer_url() + end;
//            Uri uri = Uri.parse(murl);
//
//            Glide.with(context)
//                    .asBitmap()
//                    .load(uri)
//                    .apply(new RequestOptions()
//                            .dontTransform()
//                            .format(DecodeFormat.PREFER_ARGB_8888)
//                            .diskCacheStrategy(DiskCacheStrategy.RESOURCE))
//                    .into(new SimpleTarget<Bitmap>(Target.SIZE_ORIGINAL,Target.SIZE_ORIGINAL) {
//                        @Override
//                        public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
//                            view.setImageBitmap(resource);
//                        }
//                    });
//        }
//    }


}
