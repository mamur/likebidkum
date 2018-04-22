
package com.jasakreatif.bidkum.library.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.jasakreatif.bidkum.R;
import com.jasakreatif.bidkum.library.remote.DownloadFile;
import com.jasakreatif.bidkum.library.remote.DownloadFileUrlConnectionImpl;

public class LegacyPDFView extends LinearLayout implements DownloadFile.Listener {
    TextView textView;
    ProgressBar progressBar;
    Button button;
    DownloadFile downloadFile;

    public LegacyPDFView(Context context) {
        super(context);
        init(null);
    }

    public LegacyPDFView(Context context, DownloadFile downloadFile) {
        super(context);
        this.downloadFile = downloadFile;
        init(null);
    }

    public LegacyPDFView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public LegacyPDFView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        View v = inflate(getContext(), getLayoutId(), this);

        if (viewFound(v, R.id.legacy_pdf_textView)) {
            textView = (TextView) v.findViewById(R.id.legacy_pdf_textView);
        }
        if (viewFound(v, R.id.legacy_pdf_button)) {
            button = (Button) v.findViewById(R.id.legacy_pdf_button);
        }
        if (viewFound(v, R.id.legacy_pdf_progressBar)) {
            progressBar = (ProgressBar) v.findViewById(R.id.legacy_pdf_progressBar);
        }

        if (downloadFile == null) {
            downloadFile = new DownloadFileUrlConnectionImpl(getContext(), new Handler(), this);
        }

//        if (attrs != null) {
//            TypedArray a;
//
//            a = getContext().obtainStyledAttributes(attrs, R.styleable.LegacyPDFView);
//
//            a.recycle();
//        }
    }

    protected boolean viewFound(View root, int id) {
        return root.findViewById(id) != null;
    }

    public void setOnClickListener(OnClickListener l) {
        getButton().setOnClickListener(l);
    }

    public int getMax() {
        return getProgressBar().getMax();
    }

    public void setMax(int max) {
        getProgressBar().setMax(max);
    }

    public void setProgress(int progress) {
        getProgressBar().setProgress(progress);
    }

    public void setText(String text) {
        getTextView().setText(text);
    }

    public void setText(int resId) {
        getTextView().setText(resId);
    }

    //region overridable methods - You can customize this view by adding a subclass with your own implementations
    protected int getLayoutId() {
        return R.layout.view_legacy_pdf;
    }

    protected TextView getTextView() {
        return textView;
    }

    protected ProgressBar getProgressBar() {
        return progressBar;
    }

    protected Button getButton() {
        return button;
    }
    //end region

    //region DownloadFile.Listener virtuals
    @Override
    public void onSuccess(String url, String destinationPath) {

    }

    @Override
    public void onFailure(Exception e) {

    }

    @Override
    public void onProgressUpdate(int progress, int total) {
        if (getMax() != total) {
            setMax(total);
        }

        setProgress(progress);
    }
    //endregion
}
