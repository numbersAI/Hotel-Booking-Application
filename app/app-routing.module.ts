import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BookingComponent } from './components/booking/booking.component';
import { ResultComponent } from './components/result/result.component';
import { SearchComponent } from './components/search/search.component';

const routes: Routes = [
  {path:'',component:SearchComponent},
  {path:'search',component:SearchComponent},
  {path:'result',component:ResultComponent},
  {path:'booking',component:BookingComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
