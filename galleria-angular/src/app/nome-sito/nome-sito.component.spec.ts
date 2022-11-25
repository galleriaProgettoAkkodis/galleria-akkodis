import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NomeSitoComponent } from './nome-sito.component';

describe('NomeSitoComponent', () => {
  let component: NomeSitoComponent;
  let fixture: ComponentFixture<NomeSitoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NomeSitoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NomeSitoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
