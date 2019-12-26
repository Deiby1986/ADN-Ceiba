import { Salesdetail } from './salesdetail';

export class Salesheader {
    public id:number;
	public nombreCliente:string;
	public fecha:string;	
	public total:string;
	public detalles :Salesdetail[];
}
