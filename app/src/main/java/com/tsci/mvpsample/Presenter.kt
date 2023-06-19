package com.tsci.mvpsample

/**
 * Created by tasci on 19.06.2023.
 */
class Presenter(private val view: IView): IPresenter {



    override fun setRandomName() {
        val name = MockNameGenerator().getName()
        view.setName(name)
    }



    private inner class MockNameGenerator(){

        private val names = arrayOf(
            "John",
            "Jason",
            "Susan",
            "Mary",
            "Diego",
            "Annie",
            "Eren"
        )
        fun getName() = names.random()
    }
}