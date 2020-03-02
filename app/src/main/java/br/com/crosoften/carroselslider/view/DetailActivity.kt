package br.com.crosoften.carroselslider.view

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.crosoften.carroselslider.R
import com.bumptech.glide.Glide
import com.skydoves.transformationlayout.TransformationLayout
import com.skydoves.transformationlayout.onTransformationEndContainer
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        onTransformationEndContainer(intent.getParcelableExtra(parmasExtraName))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        intent.getParcelableExtra<Poster>(posterExtraName)?.let {
            Glide.with(this)
                .load(it.poster)
                .into(profile_detail_background)
            detail_title.text = it.name
            detail_description.text = it.description
        }
    }

    companion object {
        const val parmasExtraName = "parmasExtraName"
        const val posterExtraName = "posterExtraName"
        fun startActivity(context: Context, transformationLayout: TransformationLayout, poster: Poster) {
            if (context is Activity) {
                val bundle = transformationLayout.withView(transformationLayout, poster.name)
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra(parmasExtraName, transformationLayout.getParcelableParams())
                intent.putExtra(posterExtraName, poster)
                context.startActivity(intent, bundle)
            }
        }
    }
}
