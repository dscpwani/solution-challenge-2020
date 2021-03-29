package com.ngangavictor.solutionchallenge2021

import android.os.Bundle
import android.view.Menu
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.ProgressBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var webView: WebView

    lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        progressBar = findViewById(R.id.progressBar)
        webView = findViewById(R.id.webView)

        val drawerToggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerToggle.isDrawerIndicatorEnabled = false
        drawerToggle.toolbarNavigationClickListener = View.OnClickListener { drawerLayout.open() }
        drawerToggle.setHomeAsUpIndicator(R.drawable.ic_ham)

        webView.settings.javaScriptEnabled = true
        webView.settings.loadWithOverviewMode = true
        webView.settings.useWideViewPort = true

        webView.webChromeClient = object : WebChromeClient() {

            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                if (newProgress < 100) {
                    //show progress
                    progressBar.visibility = View.VISIBLE
                    webView.visibility = View.GONE
                } else {
                    //hide progress
                    progressBar.visibility = View.GONE
                    webView.visibility = View.VISIBLE
                }
            }
        }

        webView.loadUrl("https://good-health-and-well-being.web.app/intro-sexual-health.html")

        navView.menu.findItem(R.id.nav_home).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/intro-sexual-health.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_chlamydia).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/std-chlamydia.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_gonorrhea).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/std-gonorrhea.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_hiv).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/std-hiv.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_hpv).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/std-hpv.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_pubic_lice).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/std-pubic-lice.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_syphilis).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/std-syphilis.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_trichomoniasis).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/std-trichomoniasis.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_early_sex).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/early-sex.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_rights).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/rights.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_sexual_assault).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/sexual-assualt.html")
            drawerLayout.close()
            true
        }

        navView.menu.findItem(R.id.nav_prevent_sexual_assault).setOnMenuItemClickListener {
            webView.loadUrl("https://good-health-and-well-being.web.app/prevent-sexual-assualt.html")
            drawerLayout.close()
            true
        }

    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.main, menu)
//        return true
//    }
}