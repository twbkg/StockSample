package xyz.twbkg.stock.ui.unit

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.toolbar.*
import xyz.twbkg.stock.R
import xyz.twbkg.stock.application.BaseActivity
import xyz.twbkg.stock.util.extension.configToolbars
import xyz.twbkg.stock.util.extension.inflateFragment

class UnitActivity : BaseActivity() {

    override fun enableHome(): Boolean = true

    override fun configToolbar(): Toolbar? = toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_with_toolbar)

        configToolbar()?.let { toolbar ->
            this.configToolbars(toolbar, enableHome())
        }

        inflateFragment(UnitFragment.newInstance())
    }
}