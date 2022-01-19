/**
 * Natapatchara Anuroje (นาย ณัฐพัชร อนุโรจน์)
 * Email: natapatchara.anuroje@gmail.com
 * LINE MAN Wongnai Junior 2022 - Engineering Team
 * Assignment for the Intern-Software Engineer, Android
 */
package com.example.wongnaiandroidassignment;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wongnaiandroidassignment.Model.CoinsResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            new CallApi().execute("https://api.coinranking.com/v2/coins", "GET").get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public class CallApi extends AsyncTask<String, String, String> {
        ProgressDialog progressDialog;
        public CallApi() {
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("...");
            progressDialog.setTitle("Progressing");
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.show();
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            Gson gson = new GsonBuilder().create();
            CoinsResponse response = gson.fromJson(result, CoinsResponse.class);
            recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

            ListViewHolder listViewHolder = new ListViewHolder(MainActivity.this, response.getData().getCoins());
            recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(listViewHolder);

            progressDialog.dismiss();
        }
        @Override
        protected String doInBackground(String... params) {
            String urlString = params[0];
            String method = params[1];
            HttpURLConnection client = null;
            String result = null;
            BufferedReader reader = null;

            try {
                URL url = new URL(urlString);
                client = (HttpURLConnection) url.openConnection();

                client.setRequestMethod(method);
                client.setRequestProperty("Content-Type","application/json");

                reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line = null;
                while ((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
                }

                result = sb.toString();
            } catch (MalformedURLException ex) {
                Log.d(TAG, "MalformedURLException :" + ex);
            } catch (SocketTimeoutException ex) {
                Log.d(TAG, "SocketTimeoutException :" + ex);
            } catch (IOException ex) {
                Log.d(TAG, "IOException :" + ex);
            } finally {
                client.disconnect();
                Log.d(TAG, "End Http ");
            }
            return result;
        }
    }
}