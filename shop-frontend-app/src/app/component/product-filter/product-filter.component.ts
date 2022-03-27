import {Component, Input, OnInit} from '@angular/core';
import {Page} from "../../model/page";

@Component({
  selector: 'app-product-filter',
  templateUrl: './product-filter.component.html',
  styleUrls: ['./product-filter.component.scss']
})
export class ProductFilterComponent implements OnInit {

  nameFilter: string = '';

  @Input() page?: Page;

  constructor() { }

  ngOnInit(): void {
  }

}
