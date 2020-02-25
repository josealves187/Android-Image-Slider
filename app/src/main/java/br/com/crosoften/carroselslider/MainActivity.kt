package br.com.crosoften.carroselslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.MutableLiveData

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageList = ArrayList<SlideModel>()
// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title
// imageList.add(SlideModel("String Url" or R.drawable, "title", true) Also you can add centerCrop scaleType for this image
        imageList.add(SlideModel("https://i.ibb.co/PhLLnP5/download-1.jpg",  true))
        imageList.add(SlideModel("https://i.ibb.co/xf1WWQy/download.jpg"))
        imageList.add(SlideModel("https://i.ibb.co/KLhXShx/images-1.jpg"))
        imageList.add(SlideModel("https://i.ibb.co/d5zm9dy/images-2.jpg"))
        imageList.add(SlideModel("https://i.ibb.co/FnsJqQN/images-3.jpg"))
        imageList.add(SlideModel("https://i.ibb.co/nRF57r9/images-4.jpg"))
        imageList.add(SlideModel("https://i.ibb.co/WnDF6zJ/images.jpg"))
        imageList.add(SlideModel("https://i.ibb.co/yy2YfKj/images.png"))
        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
                Toast.makeText(this@MainActivity, " teste2 ", Toast.LENGTH_SHORT).show()
            }
        })


    }

}
