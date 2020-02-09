// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.xyzreader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArticleDetailFragment_ViewBinding<T extends ArticleDetailFragment> implements Unbinder {
  protected T target;

  @UiThread
  public ArticleDetailFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mScrollView = Utils.findRequiredViewAsType(source, R.id.scrollView, "field 'mScrollView'", NestedScrollView.class);
    target.mPhotoContainerView = Utils.findRequiredView(source, R.id.photo_container, "field 'mPhotoContainerView'");
    target.mPhotoView = Utils.findRequiredViewAsType(source, R.id.thumbnail, "field 'mPhotoView'", ImageView.class);
    target.parallaxBar = Utils.findOptionalViewAsType(source, R.id.parallax_bar, "field 'parallaxBar'", AppBarLayout.class);
    target.mShareFab = Utils.findRequiredViewAsType(source, R.id.share_fab, "field 'mShareFab'", FloatingActionButton.class);
    target.metaBar = Utils.findRequiredViewAsType(source, R.id.meta_bar, "field 'metaBar'", LinearLayout.class);
    target.titleView = Utils.findRequiredViewAsType(source, R.id.article_title, "field 'titleView'", TextView.class);
    target.bylineView = Utils.findRequiredViewAsType(source, R.id.article_byline, "field 'bylineView'", TextView.class);
    target.detailToolbar = Utils.findRequiredViewAsType(source, R.id.detail_toolbar, "field 'detailToolbar'", Toolbar.class);
    target.bodyView = Utils.findRequiredViewAsType(source, R.id.article_body, "field 'bodyView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mScrollView = null;
    target.mPhotoContainerView = null;
    target.mPhotoView = null;
    target.parallaxBar = null;
    target.mShareFab = null;
    target.metaBar = null;
    target.titleView = null;
    target.bylineView = null;
    target.detailToolbar = null;
    target.bodyView = null;

    this.target = null;
  }
}
