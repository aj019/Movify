package in.androidmate.anujgupta.movify.di.modules;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anujgupta on 22/01/18.
 */

@Module
public class ApplicationModule {

    private Application app;

    public ApplicationModule(Application app){
        this.app = app;
    }


    @Provides
    @Singleton
    Context provideContext(){
        return app;
    }

}
