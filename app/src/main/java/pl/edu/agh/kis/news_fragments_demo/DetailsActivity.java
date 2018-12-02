package pl.edu.agh.kis.news_fragments_demo;

import android.content.res.Configuration;
import android.app.Activity;
import android.os.Bundle;

public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        if (savedInstanceState == null) {
            ArticleReaderFragment details = new ArticleReaderFragment();
            details.setArguments(getIntent().getExtras());
            getFragmentManager().beginTransaction()
                    .add(android.R.id.content, details)
                    .commit();
        }
    }
}
