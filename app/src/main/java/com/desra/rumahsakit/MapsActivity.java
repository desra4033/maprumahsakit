package com.desra.rumahsakit;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.desra.rumahsakit.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng PALMA = new LatLng(-2.206561, 113.915338);
        mMap.addMarker(new MarkerOptions().position(PALMA).title("Marker in PALMA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PALMA));

        // Add a marker in Sydney and move the camera
        LatLng RSUDdrDorisSylvanus = new LatLng(-2.210516, 113.922496);
        mMap.addMarker(new MarkerOptions().position(RSUDdrDorisSylvanus).title("Marker in RSUDdrDorisSylvanus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSUDdrDorisSylvanus));

        mMap.addPolyline(new PolylineOptions().add(
               PALMA,
                new LatLng(-2.206561, 113.915338),
                new LatLng(-2.206840, 113.915963),
                new LatLng(-2.206694, 113.916561),
                new LatLng(-2.207069, 113.917066),
                new LatLng(-2.207580, 113.917208),
                new LatLng(-2.207635, 113.917489),
                new LatLng(-2.205582, 113.921188),
                new LatLng(-2.208302, 113.922868),
                new LatLng(-2.208647, 113.923556),
                new LatLng(-2.211641, 113.923330),
                new LatLng(-2.211374, 113.923211),
                new LatLng(-2.210516, 113.922496),
                RSUDdrDorisSylvanus
                ).width(10)
                        .color(Color.BLUE)
        );
    }
}