package com.example.admin.tour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Blog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        public class Blog {
            private String name,address,image;

            public Blog() {
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }
        }

    }

    public String getImage(){
    return null;
    }


    public String getAddress() {
        return null;
    }

    public String getName() {
        return null;
    }
}
