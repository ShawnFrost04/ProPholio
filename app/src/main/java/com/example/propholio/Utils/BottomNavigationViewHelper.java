package com.example.propholio.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.propholio.CrowdFav.CrowdFavActivity;
import com.example.propholio.Home.MainActivity;
import com.example.propholio.Profile.ProfileActivity;
import com.example.propholio.R;
import com.example.propholio.Search.SearchActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavView:Settings Nav View");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
//      bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context,BottomNavigationViewEx viewEx){
        viewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
//                    Add Animations Here so the Change Look Cool
                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_hear:
                        Intent intent2 = new Intent(context, CrowdFavActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_search:
                        Intent intent4 = new Intent(context, SearchActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_profile:
                        Intent intent3 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent3);
                        break;
                }


                return false;
            }
        });
    }

}
