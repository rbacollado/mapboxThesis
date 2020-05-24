package com.example.admin.mapboxthesis;

//Mapbox sdk style classes
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import  com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    //Needed to initialize maps
    private MapView mapView;
    private MapboxMap mbMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mapbox.getInstance(this, getString(R.string.access_token));
        setContentView(R.layout.activity_main);

        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReading_Activity();
            }
        });

    }

    @Override
    public void onMapReady(@NonNull MapboxMap mapboxMap) {
        MainActivity.this.mbMap = mapboxMap;
        mapboxMap.setStyle(Style.LIGHT, new Style.OnStyleLoaded() {
            @Override
            public void onStyleLoaded(@NonNull Style style) {
            Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
            /**
             * create this function & code below
             */
            MarkerOptions loc1 = new MarkerOptions();
            loc1.title("Location 1");

            loc1.position(new LatLng(7.1010926, 125.6140598));
            mbMap.addMarker(loc1);

            MarkerOptions loc2 = new MarkerOptions();
            loc2.title("Location 2");

            loc2.position(new LatLng(7.048769, 125.572143));
            mbMap.addMarker(loc2);

            MarkerOptions loc3 = new MarkerOptions();
            loc3.title("Location 3");

            loc3.position(new LatLng(7.037902, 125.506927));
            mbMap.addMarker(loc3);
            }
        });
    }

    /**
     * Opens Sensor Readings Activity
     */
    public void  openReading_Activity(){
        Intent intent = new Intent(this, Reading_Activity.class);
        startActivity(intent);
    }

    /**
     * Lifecycle methods
     */
    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    /**
     * POJO model class for a single location in the recyclerview
     */
    class SingleRecyclerViewLocation {

        private String name;
        private String bedInfo;
        private LatLng locationCoordinates;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBedInfo() {
            return bedInfo;
        }

        public void setBedInfo(String bedInfo) {
            this.bedInfo = bedInfo;
        }

        public LatLng getLocationCoordinates() {
            return locationCoordinates;
        }

        public void setLocationCoordinates(LatLng locationCoordinates) {
            this.locationCoordinates = locationCoordinates;
        }
    }


}
